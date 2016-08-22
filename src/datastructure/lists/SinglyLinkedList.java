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

        Node<T> newNode = new Node<T>(value);

        if(size == 0){

        }

    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        Node(){

        }

        Node(T value){
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
