//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class DogTest {
//
//    // Create the class `Dog`
//    // Do not modify the code of the tests!
//
//    @Test
//    public void dogName() {
//        // Dog constructor takes a String Argument for name
//        Dog d = new Dog("Bob");
//        // name is returned from getter
//        assertEquals("Bob", d.getName());
//    }
//
//    @Test
//    public void dogHealth() {
//        // Dog is an Animal
//        Animal a = new Dog("Rupert");
//
//        // all dogs start with health 50
//        assertEquals(50, a.getHealth());
//
//        // a dog's health decreases by 3 points for every kilometer it runs
//        a.run(2);
//        assertEquals(44, a.getHealth());
//        a.run(10);
//        assertEquals(14, a.getHealth());
//    }
//
//    @Test
//    public void goodDog() {
//
//        // Dog has a method `isGoodDog()` which returns true if the dog is good.
//        // a dog is good, if
//        // - the dog's name starts with "Bo" or "Li"
//        // - and the dog's health is greater than 25
//
//        Dog d1 = new Dog("Bob");
//        assertTrue(d1.isGoodDog());
//        d1.run(5);
//        assertEquals(35, d1.getHealth());
//        assertTrue(d1.isGoodDog());
//        d1.run(5);
//        assertEquals(20, d1.getHealth());
//        assertFalse(d1.isGoodDog());
//
//        Dog d2 = new Dog("Lisa");
//        assertTrue(d2.isGoodDog());
//        d2.run(10);
//        assertFalse(d2.isGoodDog());
//
//        Dog d3 = new Dog("Bart");
//        assertFalse(d3.isGoodDog());
//        d2.run(2);
//        assertFalse(d3.isGoodDog());
//    }
//
//}
