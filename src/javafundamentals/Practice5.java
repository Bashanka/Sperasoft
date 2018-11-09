package javafundamentals;

public class Practice5 {

    public void towerOfHanoi(int n, char fromTower, char toTower, char useTower) { // n - count od disks
        if (n > 0) {
            towerOfHanoi(n-1, fromTower, useTower, toTower);
            System.out.println(n + " moved from " + fromTower + " to " + toTower);
            towerOfHanoi(n-1, useTower, toTower, fromTower);
        }
    }

}
