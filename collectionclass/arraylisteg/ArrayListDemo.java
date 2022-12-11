package collectionclass.arraylisteg;

import java.util.ArrayList;

public class ArrayListDemo {
  private ArrayList<String> tasks;

  public ArrayListDemo() {
    tasks = new ArrayList<>();
  }

  public void addTask(String task) {
    tasks.add(task);
  }

  public void removeTask(int index) {
    tasks.remove(index);
  }

  public void updateTask(int index, String newTask) {
    tasks.set(index, newTask);
  }

  public void printTasks() {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println((i + 1) + ": " + tasks.get(i));
    }
  }
  public static void main(String[] args) {
    ArrayListDemo toDoList = new ArrayListDemo();
    toDoList.addTask("Take out the trash");
    toDoList.addTask("Do the dishes");
    toDoList.addTask("Finish homework");
    toDoList.printTasks();

    /** 
      toDoList.updateTask(1, "Clean the kitchen");
      toDoList.printTasks(); 
    */
  }
}
