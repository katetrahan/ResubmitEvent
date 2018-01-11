import models.Event;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertTrue(testEvent instanceof Event);
    }

    @Test
    public void people_addPeopleCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(100,testEvent.getPeopleCost());

    }

    @Test
    public void food_addFoodCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(200,testEvent.getFoodCost());


    }

    @Test
    public void booze_addBoozeCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(300, testEvent.getBoozeCost());
    }

    @Test
    public void entertainment_addBandCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(300, testEvent.getBandCost());

    }

    @Test
    public void final_addFinalCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(600,testEvent.getFinalCost());
    }





//    @Test
//    public void newEvent_addCost() throws Exception {
//        Event testEvent = new Event("", "", "", "");
//        testEvent.addCost(1);
//        assertEquals(1, testEvent.getFinalCost());
//
//    }

    }
