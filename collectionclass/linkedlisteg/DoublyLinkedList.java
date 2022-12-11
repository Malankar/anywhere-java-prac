package collectionclass.linkedlisteg;

public class DoublyLinkedList<T> {
  // Node class to represent the elements in the list
  private class Node {
    T data;
    Node prev;
    Node next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  // Add an element to the end of the list
  public void add(T element) {
    Node node = new Node(element);
    if (tail != null) {
      tail.next = node;
      node.prev = tail;
      tail = node;
    } else {
      head = node;
      tail = node;
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

    if (current.prev != null) {
      current.prev.next = current.next;
    } else {
      head = current.next;
    }

    if (current.next != null) {
      current.next.prev = current.prev;
    } else {
      tail = current.prev;
    }

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

