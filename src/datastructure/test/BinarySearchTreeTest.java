package datastructure.test;

import org.junit.Test;

import datastructure.trees.BinarySearchTree;

import static org.junit.Assert.assertNotNull;

/**
 * Created by chris on 8/22/2016.
 */
public class BinarySearchTreeTest {
    @Test
    public void BinarySearchTreeShouldNotBeNull(){
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        assertNotNull("Binary Search Tree should not be null", bst);
    }

}
