package datastructure.test;

import org.junit.Test;

import datastructure.lists.SinglyLinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by chris on 8/22/2016.
 */
public class SinglyLinkedListTest {

    @Test
    public void SinglyLinkedListShouldNotBeNull(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        assertNotNull("Linked list should not be null", linkedList);
    }

    @Test
    public void SinglyLinkedListShouldHaveOneItem(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insert("string1");
        assertEquals("Size should equal one", 1, linkedList.getSize());
    }

    @Test
    public void SinglyLinkedListShouldGetItemAtIndex(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insert("string1");
        linkedList.insert("string2");
        String value = linkedList.get(1);
        assertEquals("Value should equal string2", "string2", value);
    }

    @Test
    public void SinglyLinkedListShouldAddItemAtIndex(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insert("string1");
        linkedList.insert("string2");
        linkedList.insert(1, "string3");
        String value = linkedList.get(1);
        assertEquals("Value should equal string3", "string3", value);
    }

    @Test
    public void SinglyLinkedListShouldRemoveHead(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insert("string1");
        linkedList.insert("string2");
        linkedList.insert("string3");
        String value = linkedList.remove();
        assertEquals("Value should equal string1", "string1", value);
        assertEquals("Size should be 2", 2, linkedList.getSize());
    }

    @Test
    public void SinglyLinkedListShouldRemoveItemAtIndex(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insert("string1");
        linkedList.insert("string2");
        linkedList.insert("string3");
        String value = linkedList.remove(1);
        assertEquals("Value should equal string2", "string2", value);
        assertEquals("Size should be 2", 2, linkedList.getSize());
        assertEquals("Item at index 1 should be string3", "string3", linkedList.get(1));
    }
}
