package todo;

import java.util.ArrayList;

public class Task {

  ArrayList<Task> tasklist; 

  public void Task() {
    ArrayList<Task> tasklist = new ArrayList<Task>();
  }

  public String addTask(String task) {
    String 
    tasklist.add(task);
  }

  public ArrayList<Task> getTasks() {
    System.out.println(tasklist);
    return tasklist;
  }

}

public class Task {

  // This is a "nested" static class made for convenience here - 
  // you can assume the following line is right!

      // Properties
      private String taskItem;

      // Constructor
      public Student(String taskItem) {
          this.taskItem = taskItem;
      } 

      // Getters
      public String getName() {
          return this.name;
      }

      public String getCohortName() {
          return this.cohortName;
      }

  public static void main(String[] args) {
      ArrayList<StudentDirectory.Student> studentList = new ArrayList<StudentDirectory.Student>();
      studentList.add(new Student("Alex", "January 2020"));
      studentList.add(new Student("Maria", "January 2020"));
      studentList.add(new Student("Lisa", "January 2020"));

      Enumeration<Student> enumeration = Collections.enumeration(studentList);

      System.out.println("List of students:");
      while (enumeration.hasMoreElements()) {
          Student currentStudent = enumeration.nextElement();
          String line = String.format(" * %s - %s", currentStudent.name, currentStudent.cohortName);
          System.out.println(line);
      }
  }
}