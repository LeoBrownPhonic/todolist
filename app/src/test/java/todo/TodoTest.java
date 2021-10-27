package todo;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TodoTest {
  
    @Test public void testStartWithEmptyTodo() {
        Todo classUnderTest = new Todo();
        ArrayList<String> emptytest = new ArrayList<String>();
        assertEquals("check list starts empty", classUnderTest.getTasks(), emptytest);
    }
}
