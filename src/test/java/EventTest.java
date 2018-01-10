import models.Event;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception{
        Event testEvent = new Event("people", "food", "booze");
        assertTrue(testEvent instanceof Event);
    }

    @Test
    public void newEvent_acceptsPeople_String() {
        Event testEvent = new Event ("people", "food", "booze");
        assertEquals("", testEvent.getPeople());

    }

    @Test
    public void newEvent_acceptsFood_String() {
        Event testEvent = new Event ("people", "food", "booze");
        assertEquals("", testEvent.getFood());
    }

    @Test
    public void newEvent_acceptsBooze_String(){
        Event testEvent = new Event ("people", "food", "booze");
        assertEquals("", testEvent.getBooze());
    }


}