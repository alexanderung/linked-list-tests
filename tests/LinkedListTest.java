
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import a4.LinkedList;
import a4.List;

public class LinkedListTest {

  @Test
  void sizeTest() {
    List<Integer> list = new LinkedList<>();
    list.add(7);
    assertEquals(list.size(), 1, "Expected size of list to be 1");
  }

  @Test
  void isEmptyTest() {
    List<Integer> list = new LinkedList<>();
    list.add(7);
    assertFalse(list.isEmpty(), "Expected isEmpty to return false");
  }

  @Test
  void clearTest() {
    List<Integer> list = new LinkedList<>();
    list.add(7);
    list.clear();
    assertEquals(list.size(), 0, "Expected size of list to be 0");
  }

  @Test
  void containsTest() {
    List<Integer> list1 = new LinkedList<>();
    list1.add(7);
    assertTrue(list1.contains(7), "Expected contains to return true");
  }

  @Test
  void toArrayTest() {
    List<Integer> list = new LinkedList<>();
    list.add(7);
    list.add(2);
    Integer[] expected = new Integer[]{7, 2};
    assertArrayEquals(list.toArray(), expected, "Expected array: [7, 2]");
  }

  @Test
  void addTest() {
    List<Integer> integerList = new LinkedList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    assertEquals(integerList.get(0), 1, "Expected 0th element to be 1");
    assertEquals(integerList.get(1), 2, "Expected 1st element to be 2");
    assertEquals(integerList.get(2), 3, "Expected 2nd element to be 3");

    List<Boolean> booleanList = new LinkedList<>();
    booleanList.add(false);
    booleanList.add(true);
    booleanList.add(false);
    assertEquals(booleanList.get(0), false, "Expected 0th element to be false");
    assertEquals(booleanList.get(1), true, "Expected 1st element to be true");
    assertEquals(booleanList.get(2), false, "Expected 2nd element to be false");
  }

  @Test
  void removeTest() {
    List<Integer> list = new LinkedList<>();
    list.add(1);
    list.remove((Integer) 1);
    assertTrue(list.isEmpty(), "Expected list to be empty after 1 insert and 1 remove");
  }

  @Test
  void getTest() {
    List<Integer> list = new LinkedList<>();
    list.add(1);
    assertEquals(list.get(0), 1, "Expected get() to return 1 at index 0");
  }

  @Test
  void setTest() {
    List<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(2);
    list.set(0, 4);
    assertEquals(list.get(0), 4, "Expected 0th element to be 4");
    assertEquals(list.get(1), 2, "Expected 1st element to be 2");
  }

  @Test
  void addIndexElementTest() {
    List<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(2);
    list.add(0, 4);
    assertEquals(list.get(0), 4, "Expected 0th element to be 4");
    assertEquals(list.get(1), 3, "Expected 1st element to be 3");
    assertEquals(list.get(2), 2, "Expected 2nd element to be 2");
  }

  @Test
  void removeIndexTest() {
    List<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(2);
    list.remove(0);
    assertEquals(list.get(0), 2, "Expected 0th element to be 2");
  }

  @Test
  void indexOfTest() {
    List<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(2);
    assertEquals(list.indexOf(3), 0, "Expected index of 3 to be 0");
  }

  @Test
  void lastIndexOfTest() {
    List<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(3);
    list.add(3);
    list.add(2);
    assertEquals(list.lastIndexOf(3), 2, "Expected last index of 3 to be 2");
  }
}
