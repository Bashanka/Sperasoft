package objectsbasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of dogs and names for as many dogs as you wants");
        String[] arr = in.nextLine().split(" ");
        Dog[] dogs = new Dog[Integer.parseInt(arr[0])];
        for (int i = 0; i < dogs.length; i++) {
            if (i < (arr.length - 1)) dogs[i] = new Dog(arr[i + 1]);
            else dogs[i] = new Dog();
        }
        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName() + " " + dogs[i].getSize() + " " + dogs[i].getAge());
        }
        System.out.println();
        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSize().compareTo(o2.getSize());
            }
        });
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName() + " "  + dogs[i].getSize() + " " + dogs[i].getAge());
        }
        System.out.println();
        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName() + " " + dogs[i].getSize() + " " + dogs[i].getAge());
        }
        System.out.println();
    }
}
