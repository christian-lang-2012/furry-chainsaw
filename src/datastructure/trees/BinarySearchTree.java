package datastructure.trees;

/**
 * Created by chris on 8/22/2016.
 * Binary search requires an order relation by which every element (item)
 * can be compared with every other element in the sense
 * of a total preorder.
 */
public class BinarySearchTree<T extends Comparable> {

    private Node<T> leaf;

    public void insert(T value) {
        if (leaf == null) {
            leaf = new Node(value);
        } else {
            leaf = insert(leaf, value);
        }
    }

    private Node<T> insert(Node<T> node, T value) {
        if (node == null) {
            node = new Node<>(value);
            return node;
        } else {
            int comparisonResult = node.getValue().compareTo(value);

            if (comparisonResult == 0) {
                throw new IllegalArgumentException("A binary search tree cannot have duplicate values. Duplicate value: " + value.toString());
            } else if (comparisonResult > 0) {
                node.setLeft(insert(node.getLeft(), value));
            } else if (comparisonResult < 0) {
                node.setRight(insert(node.getRight(), value));
            }
            return node;
        }
    }

    public String preOrder() {
        return preOrder(leaf);
    }

    private String preOrder(Node node) {
        String s = "";
        if (node == null) {
            return "";
        }
        s += node.getValue() + ",";
        s += preOrder(node.getLeft());
        s += preOrder(node.getRight());
        return s;
    }

    public String inOrder() {
        return inOrder(leaf);
    }

    private String inOrder(Node node) {
        String s = "";
        if (node == null) {
            return "";
        }
        s += inOrder(node.getLeft());
        s += node.getValue() + ",";
        s += inOrder(node.getRight());
        return s;
    }

    public String postOrder() {
        return postOrder(leaf);
    }

    private String postOrder(Node node) {
        String s = "";
        if (node == null) {
            return "";
        }
        s += postOrder(node.getLeft());
        s += postOrder(node.getRight());
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

        public T getValue() {
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
