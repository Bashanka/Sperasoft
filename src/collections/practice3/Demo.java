package collections.practice3;

public class Demo {
    public static void main(String[] args) {
        CustomLinkedList<String> strings = new CustomLinkedList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.add("Fourth");
        CustomIterator it = strings.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        strings.remove();
        it = strings.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        strings.reverse();
        it = strings.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }
}
