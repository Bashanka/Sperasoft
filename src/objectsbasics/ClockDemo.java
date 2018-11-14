package objectsbasics;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first time in seconds: ");
        int seconds = in.nextInt();
        Clock firstClock = new Clock(seconds);
        System.out.println("First time is " + firstClock.getStringView());
        System.out.println();

        System.out.println("Input second time: ");
        System.out.print("hours: ");
        int hours = in.nextInt();
        System.out.print("minutes: ");
        int minutes = in.nextInt();
        System.out.print("seconds: ");
        seconds = in.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);
        System.out.println("Second time is " + secondClock.getStringView());
        System.out.println();

        ClockDemo clockDemo = new ClockDemo();
        clockDemo.tickNTimes(firstClock, 10);
        clockDemo.tickNTimes(secondClock, 10);
        System.out.println("First time after 10 tick() is " + firstClock.getStringView());
        System.out.println("Second time after 10 tick() is " + secondClock.getStringView());

        firstClock.addClock(secondClock);
        System.out.println("First time after firstClock.addClock(secondClock): " + firstClock.getStringView());
        System.out.println("Second time after firstClock.addClock(secondClock): " + secondClock.getStringView());
        System.out.println("First time after firstClock.substractClock(secondClock): " + firstClock.substractClock(secondClock).getStringView());
    }

    public void tickNTimes(Clock clock, int n) {
        for (int i = 0; i < n; i++) {
            clock.tick();
            clock.getStringView();
        }
    }
}
