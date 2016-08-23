package datastructure.lists;


/**
 * Created by chris on 8/22/2016.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public int getSize() {
        return size;
    }


    public void insert(T value) {
        insert(size, value);
    }

    public void insert(int index, T value) {
        if (index > size) {
            throw new IllegalArgumentException("The index [" + index + "] is greater than the current size");
        }

        Node<T> newNode = new Node<>(value);

        if (size == 0) {
            if (head == null) {
                head = newNode;
                head.setNext(head);
            } else {
                newNode.setNext(head);
                head = newNode;
            }
        } else {
            Node<T> indexNode = head;
            Node<T> previous = null;
            for (int i = 0; i < index; i++) {
                previous = indexNode;
                indexNode = indexNode.getNext();
            }

            previous.setNext(newNode);
            newNode.setNext(indexNode);
        }
        size++;
    }

    public void insertFirst(T value) {
        insert(0, value);
    }

    public void insertLast(T value) {
        insert(size, value);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public T get(int index) {
        if (index > size) {
            throw new IllegalArgumentException("The index [" + index + "] is greater than the current size");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    public T getFirst() {
        return get(0);
    }

    public T getLast() {
        return get(size - 1);
    }

    public T remove() {
        return remove(0);
    }

    public T remove(int index) {
        if (index > size) {
            throw new IllegalArgumentException("The index [" + index + "] is greater than the current size");
        }

        Node<T> current = head;
        if (index == 0) {
            head = current.getNext();
            size--;
            return current.getValue();
        }

        Node<T> previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.getNext();
        }

        previous.setNext(current.getNext());
        size--;
        return current.getValue();
    }


    private class Node<T> {
        private T value;
        private Node<T> next;

        Node() {

        }

        Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
