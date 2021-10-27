package todo;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskTest {
  
    @Test public void testStartWithEmptyTodo() {
        Task classUnderTest = new Task();
        ArrayList<String> emptytest = new ArrayList<String>();
        assertEquals("check list starts empty", classUnderTest.tasklist, emptytest);
    }
    @Test public void testAddTask(){
        Task classUnderTest = new Task();
        classUnderTest.addTask("Test message");
        assertEquals("checks task is added", classUnderTest.getTasks().get(0), "Test message" );
    }
    @Test public void testGetsTasks(){
        Task classUnderTest = new Task();
        classUnderTest.addTask("1 message");
        classUnderTest.addTask("2 message");
        classUnderTest.addTask("3 message");
        assertEquals("checks getting all tasks", classUnderTest.getTasks(), classUnderTest.tasklist );
        assertEquals("checks task is added", classUnderTest.getTasks().get(0), "1 message" );
        assertEquals("checks task is added", classUnderTest.getTasks().get(2), "3 message" );
    }
}
