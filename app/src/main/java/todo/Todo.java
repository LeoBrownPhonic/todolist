package todo;

import java.util.ArrayList;

public class Todo {

  static class Task {

    private ArrayList<Task> tasklist; 

    public static void Task() {
    tasklist = new ArrayList<Task>();
    }


    public static ArrayList<Task> getTasks() {
      return tasklist;
    }

  }
  
}
