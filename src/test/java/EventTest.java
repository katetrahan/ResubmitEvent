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
        assertEquals(100,testEvent.addPeopleCost());

    }

    @Test
    public void food_addFoodCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(200,testEvent.addFoodCost());


    }

    @Test
    public void booze_addBoozeCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(300, testEvent.addBoozeCost());
    }

    @Test
    public void entertainment_addBandCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(300, testEvent.addBandCost());

    }

    @Test
    public void final_addFinalCost_Integer() throws Exception {
        Event testEvent = new Event("", "", "", "");
        assertEquals(0,testEvent.getFinalCost());
    }

    @Test
    public void coupon_addFinalCoupon_Integer() throws Exception{
        Event testEvent = new Event("", "", "", "");
        testEvent.addBoozeCost();
        testEvent.addCoupon();
        assertEquals(250,testEvent.getFinalCost());

    }





//    @Test
//    public void newEvent_addCost() throws Exception {
//        Event testEvent = new Event("", "", "", "");
//        testEvent.addCost(1);
//        assertEquals(1, testEvent.getFinalCost());
//
//    }

    }
