package datastructure.test;

import datastructure.stack.Stack;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Christian on 8/18/2016.
 */
public class StackTest {
    @Test
    public void stackShouldInitialize(){
        Stack<String> testStack = new Stack<String>();
        assertNotNull("New stack should not be null", testStack);
    }

    @Test
    public void stackShouldHaveSizeOfTwo(){
        Stack<String> testStack = new Stack<String>();
        testStack.push("string number 1");
        testStack.push("string number 2");
        assertEquals("Stack should have size of 2", 2, testStack.getSize());
    }

    @Test
    public void stackShouldHaveSizeOfZero(){
        Stack<String> testStack = new Stack<String>();
        testStack.push("string number 1");
        testStack.push("string number 2");
        testStack.pop();
        testStack.pop();
        assertEquals("Stack should have size of 0", 0, testStack.getSize());
    }

    @Test
    public void stackHeadShouldBeSecondInsertedItem(){

    }
}