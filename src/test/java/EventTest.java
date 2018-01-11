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
    public void peopleCost_addPeopleCost_Integer() throws Exception{
        Event testEvent = new Event("", "", "", "");
        assertEquals(100,testEvent.getPeopleCost());

    }

//    @Test
//    public void newEvent_addCost() throws Exception {
//        Event testEvent = new Event("", "", "", "");
//        testEvent.addCost(1);
//        assertEquals(1, testEvent.getFinalCost());
//
//    }

//    @Test
//    public void newEvent_getsCostOfHavingPeople_Integer() {
//        Event testEvent = new Event("", "", "", "");
//        assertEquals(100, testEvent.getPeople());
//
//   }
//
//    @Test
//    public void newEvent_getCostOfHavingFood_Integer() {
//        Event testEvent = new Event("", "", "", "");
//        assertEquals(100, testEvent.getFood());
//    }
//
//    @Test
//    public void newEvent_getCostOfHavingBooze_Integer(){
//        Event testEvent = new Event("", "", "", "");
//        assertEquals(100, testEvent.getBooze());
//    }
//
//    @Test
//    public void newEvent_getFinalCost_Integer(){
//        Event testEvent = new Event("", "", "", "");
//        assertEquals(400, testEvent.getFinalCost());
//    }
////
////    @Test
////    public void newEvent_acceptsBand_String(){
//        Event testEvent = new Event ("people", "food", "booze", "band");
//        assertEquals("", testEvent.getEntertainment());
//    }
//
//    @Test
//    public void newEvent_returnCost_Integer(){
//        Event testEvent = new Event ("people", "food", "booze", "band");
//        assertEquals(100, testEvent.getPeople());
//
//    }


    }
