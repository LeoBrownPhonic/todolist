package todo;

import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTest {
  
    @Test public void testStartWithEmptyTodo() {
        Task classUnderTest = new Task();
        ArrayList<Task> emptytest = new ArrayList<Task>();
        assertEquals("check list starts empty", null, classUnderTest.getTasks());
    }
}
