import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;


public class TransportationTest {

    // Create the class `Transportation`
    // Do not modify the code of the tests!

//    @Test
//    public void findWithCapacity() {
////
////        Create the class Transportation with static method findAllWithCapacity,
////        which recives two arguments: int minCapacity and List<Transporter> transporters
////
////        The method must return a new List<Transporter> containing all transporters
////        from the given list with capacity for at least minCapacity persons
////
////        The order in the returned list must remain the same.
////
////        The given list must not be modified.
//
//
//        Car c3 = new Car(3); // car for three persons
//        Car c4 = new Car(4);
//        Car c5 = new Car(5);
//        Car c8 = new Car(8);
//        Horse h = new Horse();
//
//        List<Transporter> transporters = List.of(
//                c5, c8, c3, h, c4
//        );
//
//        assertEquals(
//                List.of(c5, c8, c3, c4),
//                Transportation.findAllWithCapacity(3, transporters)
//        );
//    }
//
//
//    @Test
//    public void findWithCapacityNoMatches() {
//
//        Car c3 = new Car(3); // car for three persons
//        Car c2 = new Car(2);
//        Car c4 = new Car(4);
//        Horse h1 = new Horse();
//        Horse h2 = new Horse();
//
//        List<Transporter> transporters = List.of(
//                c4, c2, h1, c3, h2
//        );
//        assertEquals(
//                Collections.emptyList(),
//                Transportation.findAllWithCapacity(5, transporters)
//        );
//    }
//
//    @Test
//    public void findThreeLargest() {
////     Create the method Transportation.findThreeLargest(List<Transporter> transporters)
////     which returns the three transporters with the largest capacity.
////
////      The returned list must be ordered by capacity, starting with the largest.
////
////      The given list must not be modified.
//
//
//        Car c2 = new Car(2);
//        Car c4 = new Car(4);
//        Car c5 = new Car(5);
//        Car c7 = new Car(7);
//        Horse h1 = new Horse();
//        Car c0 = new Car(0);
//
//        assertEquals(
//                List.of(c7, c5, c4),
//                Transportation.findThreeLargest(
//                        List.of(c2, c0, c4, c7, c5, h1)
//                )
//        );
//
//        assertEquals(
//                List.of(c7, c4, c2),
//                Transportation.findThreeLargest(
//                        List.of(c2, c0, c4, c7, h1)
//                )
//        );
//
//        assertEquals(
//                List.of(c7, c2, h1),
//                Transportation.findThreeLargest(
//                        List.of(c2, c0, h1,  c7)
//                )
//        );
//    }


    @Test
    public void validTicketIds() {
        // Create the method Transportation.isValidTicketId(String id)
        // which returns true if the given string is a valid ticket id,
        // false otherwise.
        //
        // Every valid ticket id consists of two numbers with three digits
        // each, separated by a dash (-)
        // The first number must be divisble by five, the second number must
        // be divisible by three.
        // Leading zeroes are allowed.

        assertTrue(Transportation.isValidTicketId("500-300"));
        assertTrue(Transportation.isValidTicketId("150-333"));
        assertTrue(Transportation.isValidTicketId("555-180"));
        assertTrue(Transportation.isValidTicketId("100-006"));
        assertTrue(Transportation.isValidTicketId("010-030"));
        assertTrue(Transportation.isValidTicketId("600-600"));

        assertFalse(Transportation.isValidTicketId("Hello"));
        assertFalse(Transportation.isValidTicketId("50-300"));
        assertFalse(Transportation.isValidTicketId("555-27"));
        assertFalse(Transportation.isValidTicketId("551-004"));
        assertFalse(Transportation.isValidTicketId("+23-456"));
        assertFalse(Transportation.isValidTicketId("foo-bar"));
        assertFalse(Transportation.isValidTicketId(""));
        assertFalse(Transportation.isValidTicketId("-"));
        assertFalse(Transportation.isValidTicketId(" 555-333"));
        assertFalse(Transportation.isValidTicketId("555-333 "));

    }

}
