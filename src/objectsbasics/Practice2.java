package objectsbasics;

public class Practice2 {
}

class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    private static final int HOURS_IN_A_DAY = 24;
    private static final int MINUTES_IN_A_HOUR = 60;
    private static final int SECONDS_IN_A_MINUTE = 60;

    public Clock() {
        setDefaultTime();
    }

    public Clock(int hours, int minutes, int seconds) {
        if (isTimeValid(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            setDefaultTime();
            System.out.println("The time is not valid. The default time has been set.");
        }
    }

    public Clock(int seconds) {
        setClock(seconds);
    }

    public void setClock(int seconds) {
        if (isTimeValid(seconds)) {
            this.hours = (int) seconds / MINUTES_IN_A_HOUR / SECONDS_IN_A_MINUTE;
            seconds %= MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE;
            this.minutes = (int) seconds / SECONDS_IN_A_MINUTE;
            seconds %= SECONDS_IN_A_MINUTE;
            this.seconds = seconds;
            this.getStringView();
        } else {
            setDefaultTime();
            System.out.println("The time is not valid. The default time has been set.");
        }
    }

    public void tick() {
        int seconds = getTimeInSeconds();
        if (isTimeValid(seconds + 1)) setClock(seconds + 1);
        else {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    public void tickDown() {
        int seconds = getTimeInSeconds();
        if (isTimeValid(seconds - 1)) setClock(seconds - 1);
        else {
            this.hours = HOURS_IN_A_DAY - 1;
            this.minutes = MINUTES_IN_A_HOUR - 1;
            this.seconds = SECONDS_IN_A_MINUTE - 1;
        }
    }

    public void addClock(Clock clock) {
        // we take only not whole day
        int seconds = (this.getTimeInSeconds() + clock.getTimeInSeconds()) % (HOURS_IN_A_DAY * MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE);
        setClock(seconds);
    }

    public String getStringView() {
        String hours = this.hours < 10 ? "0" + Integer.toString(this.hours) : Integer.toString(this.hours);
        String minutes = this.minutes < 10 ? "0" + Integer.toString(this.minutes) : Integer.toString(this.minutes);
        String seconds = this.seconds < 10 ? "0" + Integer.toString(this.seconds) : Integer.toString(this.seconds);
        return "(" + hours + ":" + minutes + ":" + seconds + ")";
    }

    public Clock substractClock(Clock clock) {
        int resTime = (this.getTimeInSeconds() - clock.getTimeInSeconds()) % (HOURS_IN_A_DAY * MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE);
        return resTime < 0 ? new Clock(resTime + HOURS_IN_A_DAY * MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE) : new Clock(resTime);
    }

    private int getTimeInSeconds() {
        return (this.hours * MINUTES_IN_A_HOUR + this.minutes) * SECONDS_IN_A_MINUTE + this.seconds;
    }

    private void setDefaultTime() {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    private boolean isTimeValid(int hours, int minutes, int seconds) {
        return 0 <= hours && hours < HOURS_IN_A_DAY && 0 <= minutes && minutes < MINUTES_IN_A_HOUR && 0 <= seconds &&
                seconds < SECONDS_IN_A_MINUTE;
    }

    private boolean isTimeValid(int seconds) {
        return 0 <= seconds && seconds < HOURS_IN_A_DAY * MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE;
    }

}