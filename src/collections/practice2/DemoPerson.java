package collections.practice2;

import java.util.*;

public class DemoPerson {
    public static void main(String[] args) {
        ArrayList<Person> persons1 = new ArrayList<>();
        persons1.add(new Person("Mary", 16));
        persons1.add(new Person("Peter", 18));
        persons1.add(new Person("Roman", 31));
        persons1.add(new Person("Scoty", 16));
        persons1.add(new Person("John", 12));
        persons1.add(new Person("Michel", 27));
        for (int i = 0; i < persons1.size(); i++) {
            for (int j = persons1.size() - 1; j > i; j--) {
                if (persons1.get(i).getAge() > persons1.get(j).getAge()) {
                    Person tmp = persons1.get(i);
                    persons1.set(i, persons1.get(j));
                    persons1.set(j, tmp);
                }
            }
        }
        System.out.println(persons1);
        ArrayList<Person> persons2 = new ArrayList<>();
        // without this line equals
//        persons2.add(new Person("Scoty", 17));
        persons2.add(new Person("Scoty", 16));
        persons2.add(new Person("Mary", 16));
        persons2.add(new Person("Peter", 18));
        persons2.add(new Person("Roman", 31));
        persons2.add(new Person("John", 12));
        persons2.add(new Person("Michel", 27));
        persons2.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(persons2);

        System.out.println("First Person List " + (compareArrays(persons1, persons2) ? "equals " : "does not equal ") + "Second Person List");


        ArrayList<Person> persons3 = new ArrayList<>();
        // without this line equals
        persons3.add(new Person("Scoty", 17));
        persons3.add(new Person("Scoty", 16));
        persons3.add(new Person("Scoty", 16));
        persons3.add(new Person("Scoty", 16));
        persons3.add(new Person("Mary", 16));
        persons3.add(new Person("Peter", 18));
        persons3.add(new Person("Roman", 31));
        System.out.println(removeDuplicates(persons3));
    }

    public static <T extends Comparable> ArrayList<T> removeDuplicates(ArrayList<T> arrayList) {
//        for (int i = 0; i < arrayList.size() - 1; i++)
//            for (int j = i + 1; j < arrayList.size(); j++)
//                if (arrayList.get(i).compareTo(arrayList.get(j)) != 0)
//                    arrayList.remove(j);
        return new ArrayList<>(new TreeSet<>(arrayList));
    }

    public static <T extends Comparable> boolean compareArrays(ArrayList<T> arr1, ArrayList<T> arr2) {
        if (arr1.size() != arr2.size()) return false;
        for (int i = 0; i < arr1.size(); i++) {
            boolean flag = false;
            for (int j = 0; j < arr2.size(); j++)
                if (arr1.get(i).compareTo(arr2.get(j)) == 0) {
                    flag = true;
                    break;
                }
            if (!flag) return flag;
        }
        return true;
    }

}