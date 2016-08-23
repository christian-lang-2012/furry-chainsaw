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

            if(comparisonResult == 0){
                throw new IllegalArgumentException("A binary search tree cannot have duplicate values. Duplicate value: " + value.toString());
            }

            Direction direction = comparisonResult > 0 ? Direction.Right
                    : Direction.Left;

            Node<T> nextNode = direction == Direction.Left ? leaf.getLeft() : leaf.getRight();

            insert(nextNode, value);
        }
    }

    private class Node<T extends Comparable> {
        private T value;
        private Node left;
        private Node right;

        private Node(T value) {
            this.value = value;
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

    private enum Direction{
        None,
        Left,
        Right
    }
}
