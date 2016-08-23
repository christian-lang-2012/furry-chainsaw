package datastructure.test;

import org.junit.Test;

import datastructure.trees.BinarySearchTree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by chris on 8/22/2016.
 */
public class BinarySearchTreeTest {
    @Test
    public void BinarySearchTreeShouldNotBeNull() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        assertNotNull("Binary Search Tree should not be null", bst);
    }

    @Test
    public void BinarySearchTreePreorderShouldBeCorrect() {
        BinarySearchTree<Character> bst = new BinarySearchTree<>();
        bst.insert(new Character('F'));
        bst.insert(new Character('B'));
        bst.insert(new Character('A'));
        bst.insert(new Character('D'));
        bst.insert(new Character('C'));
        bst.insert(new Character('E'));
        bst.insert(new Character('G'));
        bst.insert(new Character('I'));
        bst.insert(new Character('H'));
        assertEquals("Preorder should be correct", "F,B,A,D,C,E,G,I,H,", bst.preOrder());
    }

    @Test
    public void BinarySearchTreeInOrderShouldBeCorrect() {
        BinarySearchTree<Character> bst = new BinarySearchTree<>();
        bst.insert(new Character('F'));
        bst.insert(new Character('B'));
        bst.insert(new Character('A'));
        bst.insert(new Character('D'));
        bst.insert(new Character('C'));
        bst.insert(new Character('E'));
        bst.insert(new Character('G'));
        bst.insert(new Character('I'));
        bst.insert(new Character('H'));
        assertEquals("Inorder should be correct", "A,B,C,D,E,F,G,H,I,", bst.inOrder());
    }

    @Test
    public void BinarySearchTreePostOrderShouldBeCorrect() {
        BinarySearchTree<Character> bst = new BinarySearchTree<>();
        bst.insert(new Character('F'));
        bst.insert(new Character('B'));
        bst.insert(new Character('A'));
        bst.insert(new Character('D'));
        bst.insert(new Character('C'));
        bst.insert(new Character('E'));
        bst.insert(new Character('G'));
        bst.insert(new Character('I'));
        bst.insert(new Character('H'));
        assertEquals("Inorder should be correct", "A,C,E,D,B,H,I,G,F,", bst.postOrder());
    }

}
