package todo;

import java.util.ArrayList;

public class Task {

  ArrayList<String> tasklist; 

  // constructor
  Task() {
    this.tasklist = new ArrayList<String>();
  }

  public void addTask(String task) {
    this.tasklist.add(task);
  }

  public ArrayList<String> getTasks() {
    return this.tasklist;
  }
}
