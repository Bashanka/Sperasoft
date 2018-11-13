package objectsbasics;

import java.util.Random;

public class Practice3 {
}

class Dog {
    private String name;
    private DogSize size;
    private int age;

    public enum DogSize {
        SMALL,
        MEDIUM,
        BIG
    }

    public Dog() {
        this.name = generateName();
        this.size = generateSize();
        this.age = generateAge();
    }

    public Dog(String name) {
        this.name = name;
        this.size = generateSize();
        this.age = generateAge();
    }

    public Dog(DogSize size) {
        this.name = generateName();
        this.size = size;
        this.age = generateAge();
    }

    public Dog(int age) {
        this.name = generateName();
        this.size = generateSize();
        this.age = age;
    }

    public Dog(String name, DogSize size) {
        this.name = name;
        this.size = size;
        this.age = generateAge();
    }

    public Dog(String name, int age) {
        this.name = name;
        this.size = generateSize();
        this.age = age;
    }

    public Dog(DogSize size, int age) {
        this.name = generateName();
        this.size = size;
        this.age = age;
    }

    public Dog(String name, DogSize size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public DogSize getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(DogSize size) {
        for (DogSize ds : DogSize.values()) {
            if (ds == size) this.size = size;
        }
    }

    public void setAge(int age) {
        if (0 < age && age <= 20) this.age = age;
    }

    private String generateName() {
        String[] names = {"Bill", "Jack", "Rex", "Mike", "John", "Tom", "Snowball"};

        return names[(int)(Math.random() * names.length)];
    }

    private DogSize generateSize() {
        return DogSize.values()[new Random().nextInt(DogSize.values().length)];
    }

    private int generateAge() {
        return new Random().nextInt(20) + 1;
    }

}
