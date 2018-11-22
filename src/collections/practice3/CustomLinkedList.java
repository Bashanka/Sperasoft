package collections.practice3;

public class CustomLinkedList<T> {

    private Element<T> header = new Element<>(null, null, null);


    public static class Element<T> {

        T element;
        Element<T> prev;
        Element<T> next;

        public Element(T element, Element<T> prev, Element<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    public void add(T t) {
        Element<T> prev = null;
        Element<T> next = null;
        Element<T> element = new Element<>(t, prev, next);
    }

    public void remove() {

    }

    public void reverse() {

    }

}
