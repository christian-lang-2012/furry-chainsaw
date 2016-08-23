package datastructure.trees;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by chris on 8/22/2016.
 * Binary search requires an order relation by which every element (item)
 * can be compared with every other element in the sense
 * of a total preorder.
 */
public class BinarySearchTree<T extends Comparable> {

    private Node<T> leaf;

    public void insert(T value){
        if(leaf == null){
            leaf = new Node(value);
        }else{
            insert(leaf, value);
        }
    }

    private void insert(Node<T> node, T value){
        if(node == null){
            node = new Node<>(value);
        }
        else{
            int comparisonResult = leaf.value.compareTo(value);

            Node<T> nextNode = null;
            if(comparisonResult == 0){
                throw new IllegalArgumentException("A binary search tree cannot have duplicate values. Duplicate value: " + value.toString());
            } else if(comparisonResult < 0){
                nextNode = node.getLeft();
            } else if(comparisonResult > 0) {
                nextNode = node.getRight();
            }
            insert(nextNode, value);
        }
    }

    public String preOrder(){
        return preOrder(leaf);
    }

    private String preOrder(Node node){
        String s = "";
        if(node == null)
        {
            return "";
        }
        s += node.getValue() + ",";
        s += preOrder(node.getRight());
        s += preOrder(node.getLeft());
        return s;
    }

    public String inOrder(){
        return inOrder(leaf);
    }

    private String inOrder(Node node){
        String s = "";
        if(node == null)
        {
            return "";
        }
        s += inOrder(node.getLeft());
        s += node.getValue() + ",";
        s += inOrder(node.getRight());
        return s;
    }

    public String postOrder(){
        return postOrder(leaf);
    }

    private String postOrder(Node node){
        String s = "";
        if(node == null)
        {
            return "";
        }
        s += postOrder(node.getRight());
        s += postOrder(node.getLeft());
        s += node.getValue() + ",";

        return s;
    }

    private class Node<T extends Comparable> {
        private T value;
        private Node left;
        private Node right;

        private Node(T value) {
            this.value = value;
        }

        public T getValue(){
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
