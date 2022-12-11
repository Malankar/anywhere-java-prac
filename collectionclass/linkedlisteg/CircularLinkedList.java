package collectionclass.linkedlisteg;

public class CircularLinkedList<T> {
  // Node class to represent the elements in the list
  private class Node {
    T data;
    Node next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node head;
  private int size;

  // Add an element to the end of the list
  public void add(T element) {
    Node node = new Node(element);
    if (head == null) {
      head = node;
      node.next = head;
    } else {
      Node current = head;
      while (current.next != head) {
        current = current.next;
      }
      current.next = node;
      node.next = head;
    }
    size++;
  }

  // Remove an element at the specified index
  public T remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    Node current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    if (current == head) {
      head = current.next;
    }

    Node next = current.next;
    current.next = null;

    Node previous = head;
    while (previous.next != current) {
      previous = previous.next;
    }
    previous.next = next;

    size--;
    return current.data;
  }

  // Get the size of the list
  public int size() {
    return size;
  }

  // Get the element at the specified index
  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    Node current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    return current.data;
  }
}

