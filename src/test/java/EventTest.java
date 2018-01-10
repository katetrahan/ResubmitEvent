import models.Event;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception{
        Event testEvent = new Event("people", "food", "booze", "band");
        assertTrue(testEvent instanceof Event);
    }

    @Test
    public void newEvent_acceptsPeople_String() {
        Event testEvent = new Event ("people", "food", "booze", "band");
        assertEquals("", testEvent.getPeople());

    }

    @Test
    public void newEvent_acceptsFood_String() {
        Event testEvent = new Event ("people", "food", "booze", "band");
        assertEquals("", testEvent.getFood());
    }

    @Test
    public void newEvent_acceptsBooze_String(){
        Event testEvent = new Event ("people", "food", "booze", "band");
        assertEquals("", testEvent.getBooze());
    }

    @Test
    public void newEvent_acceptsBand_String(){
        Event testEvent = new Event ("people", "food", "booze", "band");
        assertEquals("", testEvent.getEntertainment());
    }

    @Test
    public void newEvent_returnCost_Integer(){
        Event testEvent = new Event ("people", "food", "booze", "band");
        assertEquals(100, testEvent.getPeople());

    }


}