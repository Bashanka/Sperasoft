package collections.practice3;

public class CustomLinkedList<T>{

    private Element<T> header;
    private Element<T> tail;
    private int size;

    public CustomLinkedList() {
        header = new Element<>(null, null, null);
        tail = header;
        size = 0;
    }

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
        Element<T> prev = tail;
        tail = new Element<>(t, prev, null);
        prev.next = tail;
        size++;
    }

    public Element<T> remove() {
        Element<T> rem = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return rem;
    }

    public void reverse() {
        tail = header.next;
        Element<T> currentElement = tail;
        currentElement.prev = null;
        while (currentElement.next != null) {
            Element<T> temp = currentElement.next;
            currentElement.next = currentElement.prev;
            currentElement.prev = temp;
            currentElement = temp;
        }
        currentElement.next = currentElement.prev;
        currentElement.prev = header;
        header.next = currentElement;
    }

    public CustomIterator<T> iterator() {
        return new CustomIterator<T>() {

            Element<T> currentElement = header;

            @Override
            public boolean hasNext() {
                return currentElement.next != null;
            }

            @Override
            public T next() {
                currentElement = currentElement.next;
                return currentElement.element;
            }

        };
    }
}
