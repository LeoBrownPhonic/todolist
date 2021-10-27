package todo;

import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTest {
  
    @Test public void testStartWithEmptyTodo() {
        Task classUnderTest = new Task();
        ArrayList<String> emptytest = new ArrayList<String>();
        assertEquals("check list starts empty", classUnderTest.getTasks(), emptytest);
    }
    @Test public void testAddTask(){
        Task classUnderTest = new Task();
        classUnderTest.addTask("Test message");
       // result = classUnderTest.getTask
        assertEquals("check list starts empty", classUnderTest.getTasks().get(0), "Test message" );
    }
}
