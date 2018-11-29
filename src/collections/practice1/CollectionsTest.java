package collections.practice1;

import java.util.*;

public class CollectionsTest {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(0);
        arrayList.add(7);
        arrayList.add(14);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(3);
        for (Integer element : arrayList) System.out.print(element + " ");
        System.out.println();
        arrayList.set(3, 5);
        for (Integer element : arrayList) System.out.print(element + " ");
        System.out.println();
        arrayList.remove(6);
        for (Integer element : arrayList) System.out.print(element + " ");
        System.out.println();
        Collections.sort(arrayList);
        for (Integer element : arrayList) System.out.print(element + " ");
        System.out.println();
        System.out.println();

        Set<String> femaleNames = new HashSet<>();
        femaleNames.add("Mary");
        femaleNames.add("Anna");
        femaleNames.add("Olga");
        femaleNames.add("Irina");
        femaleNames.add("Daria");
        femaleNames.add("Sveta");
        for (String element : femaleNames) System.out.print(element + " ");
        // we can't set new value for any element
        System.out.println();
        femaleNames.remove("Sveta");
        for (String element : femaleNames) System.out.print(element + " ");
        System.out.println();
        TreeSet<String> treeFemaleName = new TreeSet<>();
        treeFemaleName.addAll(femaleNames);
        for (String element : treeFemaleName) System.out.print(element + " ");
        System.out.println();
        System.out.println();

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Petrov", 5);
        marks.put("Ivanov", 4);
        marks.put("Sidorov", 3);
        marks.put("Markin", 5);
        marks.put("Zaytsev", 4);
        marks.put("Gvozd", 5);
        Set<String> keys = marks.keySet();
        for (String key : keys) System.out.print(key + " " + marks.get(key) + "\t");
        System.out.println();
        marks.put("Ivanov", 5);
        for (String key : keys) System.out.print(key + " " + marks.get(key) + "\t");
        System.out.println();
        marks.remove("Ivanov");
        for (String key : keys) System.out.print(key + " " + marks.get(key) + "\t");
        System.out.println();
        TreeSet<String> sortKeys = new TreeSet<>();
        sortKeys.addAll(marks.keySet());
        for (String key : sortKeys) System.out.print(key + " " + marks.get(key) + "\t");
        System.out.println();
        System.out.println();

        PriorityQueue<String> queueForCoffee = new PriorityQueue<>();
        queueForCoffee.add("Michel");
        queueForCoffee.add("Mary");
        queueForCoffee.add("John");
        queueForCoffee.add("Peter");
        Iterator itr = queueForCoffee.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        queueForCoffee.poll();
        itr = queueForCoffee.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        queueForCoffee.remove("Mary");
        itr = queueForCoffee.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }

}
