package collections.practice2;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age > 0 ? age : 0;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }

    @Override
    public int compareTo(Person p) {
        if (this.name.equals(p.getName())) {
            return Integer.compare(age, p.age);
        }
        return this.name.compareTo(p.getName());
    }

}