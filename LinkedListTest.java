package a4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import a4.LinkedList;
import a4.List;

public class LinkedListTest {

  @Test
  void sizeTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(7);
    assertEquals(list1.size(), 1, "Expected size of list to be 1");
  }

  @Test
  void isEmptyTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(7);
    assertEquals(list1.isEmpty(), false, "Expected isEmpty to return false");
  }

  @Test
  void clearTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(7);
    list1.clear();
    assertEquals(list1.size(), 0, "Expected size of list to be 0");
  }

  @Test
  void containsTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(7);
    assertEquals(list1.contains(7), true, "Expected contains to return true");
  }

  @Test
  void toArrayTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(7);
    list1.add(2);
    final Integer[] EXPECTED = new Integer[]{7, 2};
    assertArrayEquals(list1.toArray(), EXPECTED, "Expected array: [7, 2]");
  }

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
    list1.remove((Integer) 1);
    assertEquals(list1.isEmpty(), true, "Expected list to be empty after 1 insert and 1 remove");
  }

  @Test
  void getTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(1);
    assertEquals(list1.get(0), 1, "Expected get() to return 1 at index 0");
  }

  @Test
  void setTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(3);
    list1.add(2);
    list1.set(0, 4);
    assertEquals(list1.get(0), 4, "Expected 0th element to be 4");
    assertEquals(list1.get(1), 2, "Expected 1st element to be 2");
  }

  @Test
  void addIndexElementTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(3);
    list1.add(2);
    list1.add(0, 4);
    assertEquals(list1.get(0), 4, "Expected 0th element to be 4");
    assertEquals(list1.get(1), 3, "Expected 1st element to be 3");
    assertEquals(list1.get(2), 2, "Expected 2nd element to be 2");
  }

  @Test
  void removeIndexTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(3);
    list1.add(2);
    list1.remove(0);
    assertEquals(list1.get(0), 2, "Expected 0th element to be 2");
  }

  @Test
  void indexOfTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(3);
    list1.add(2);
    assertEquals(list1.indexOf(3), 0, "Expected index of 3 to be 0");
  }

  @Test
  void lastIndexOfTest() {
    LinkedList<Integer> list1 = new LinkedList();
    list1.add(3);
    list1.add(3);
    list1.add(3);
    list1.add(2);
    assertEquals(list1.lastIndexOf(3), 2, "Expected last index of 3 to be 2");
  }
}
