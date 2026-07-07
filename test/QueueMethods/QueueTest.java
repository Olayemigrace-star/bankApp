package QueueMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {


    @Test
    public void isEmptyTest(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());

    }
    @Test
    public void arrayIsNotEmptyTest(){
        Queue queue = new Queue();
        queue.add("football");
    assertFalse(queue.isEmpty());
    }
    @Test
    public void newElementIsAddedToTheEndOfTheQueTest(){
        Queue queue = new Queue();
        queue.add("football");
       queue.add("trainers");
        assertEquals("trainers", queue.push());
    }
    @Test
    public void throwIllegalExceptionWhenArrayIsFullTest(){
        Queue queue = new Queue();
        queue.add("football");
        queue.add("Face caps");
        queue.add("Milk");
        queue.add("Basket");
        queue.add("Shirts");
        assertThrows(IllegalArgumentException.class, () -> queue.add("cream"), "Queue is full");
    }

    @Test
    public void checkTheFirstElementInTheQueTest(){
        Queue queue = new Queue();
        queue.add("football");
        queue.add("trainers");
        assertEquals("football", queue.peek());
    }
    @Test
    public void checkTheFirstElementWhenNothingIsInTheQueTest(){
        Queue queue = new Queue();
        assertEquals(null, queue.peek());
    }
    @Test
    public void removeTheFirstElementFromTheQueueTest(){
        Queue queue = new Queue();
        queue.add("football");
        queue.add("trainers");
        assertEquals("football", queue.remove());
    }





}
