package collectionclass.linkedlisteg;

import java.util.NoSuchElementException;

/* 
 * A circular buffer is a data structure that stores a fixed-size sequence of elements, where the oldest element is overwritten by the newest element when the buffer is full. 
 */
public class CircularBuffer<T> {
  private CircularLinkedList<T> list;
  private int capacity;

  public CircularBuffer(int capacity) {
    this.list = new CircularLinkedList<>();
    this.capacity = capacity;
  }

  // Add an element to the buffer
  public void add(T element) {
    if (list.size() == capacity) {
      list.remove(0);
    }
    list.add(element);
  }

  // Remove the oldest element from the buffer
  public T remove() {
    if (list.size() == 0) {
      throw new NoSuchElementException();
    }
    return list.remove(0);
  }

  // Get the size of the buffer
  public int size() {
    return list.size();
  }

  // Get the element at the specified index
  public T get(int index) {
    return list.get(index);
  }

  public static void main(String[] args) {
    CircularBuffer<Integer> buffer = new CircularBuffer<>(5);
    // Add some elements to the buffer
    buffer.add(1);
    buffer.add(2);
    buffer.add(3);

    // The buffer now contains [1, 2, 3]
    for (int i = 0; i < buffer.size(); i++) {
      System.out.println(buffer.get(i));
    }

    // Add more elements to the buffer, overwriting the oldest element
    buffer.add(4);
    buffer.add(5);
    buffer.add(6);

    // The buffer now contains [2, 3, 4, 5, 6]
    System.out.println("\nNew List\n");
    for (int i = 0; i < buffer.size(); i++) {
      System.out.println(buffer.get(i));
    }
  }
}
