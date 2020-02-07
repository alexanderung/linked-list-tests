package a4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import a4.LinkedList;
import a4.List;
import a4.Node;
import a4.NodeImpl;

public class LinkedListTest {

    @Test
    void addTest() {
        LinkedList<Integer> list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        assertEquals(list1.get(0), 1, "Expected 0th element to be 1");
        assertEquals(list1.get(1), 2, "Expected 1st element to be 2");
        assertEquals(list1.get(2), 3, "Expected 0th element to be 3");

        LinkedList<Boolean> list2 = new LinkedList();
        list2.add(false);
        list2.add(true);
        list2.add(false);
        assertEquals(list2.get(0), false, "Expected 0th element to be false");
        assertEquals(list2.get(1), true, "Expected 1st element to be true");
        assertEquals(list2.get(2), false, "Expected 2nd element to be false");

    }

    @Test
    void removeTest() {
        LinkedList<Integer> list1 = new LinkedList();
        list1.add(1);
        list1.remove(1);
        assertEquals(list1.isEmpty(), true, "Expected list to be empty after 1 insert and 1 remove");

    }

}
