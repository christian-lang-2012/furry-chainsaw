package datastructure.stack;

/**
 * Created by Christian on 8/18/2016.
 */
public class Stack<T> {
    private Node<T> head;
    private int size;

    public int getSize() {
        return size;
    }

    public void push(T value){
        if(head == null){
            head = new Node<T>();
            head.setValue(value);
            size = 1;
        }else{
            Node newHead = new Node<T>();
            newHead.setValue(value);
            newHead.setNext(head);
            head = newHead;
            size++;
        }
    }

    public T pop(){
        if(head == null){
            return null;
        }else{
            T value = head.getValue();
            head = head.getNext();
            size--;
            return value;
        }
    }

    public T peek(){
        if(head == null){
            return null;
        }else{
            return head.getValue();
        }
    }

    private class Node<T>{
        private T value;
        private Node<T> next;

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
