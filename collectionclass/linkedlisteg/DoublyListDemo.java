package collectionclass.linkedlisteg;

public class DoublyListDemo {
  public static void main(String[] args) throws IndexOutOfBoundsException {
    try {
      DoublyLinkedList<String> queue = new DoublyLinkedList<>();
      queue.add("John");
      queue.add("Jane");
      queue.add("Mike");
      queue.add("Mary");
      queue.add("Bob");
      queue.add("Joe");
      queue.add("Jany");

      String fifthInQueue = queue.remove(5); // fifthInQueue will be "Mike"
      String secondInQueue = queue.remove(0); // secondInQueue will be "Jane"
      System.out.println("Fifth in Queue was " + fifthInQueue);
      System.out.println("Second in Queue was " + secondInQueue);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Please specify a valid index");
    }
  }

}
