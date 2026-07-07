package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp(){

        stack = new Stack();
    }

    @Test
    public void stackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushX_StackISnot_empty(){
        stack.isEmpty();
        stack.push("bags");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_PopX_StackIsEmptyTest(){
        assertTrue(stack.isEmpty());
        stack.push("bags");
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushXY_PopX_StackIsNotEmptyTest(){
        assertTrue(stack.isEmpty());
        stack.push("bags");
        stack.push("socks");
        assertFalse(stack.isEmpty());
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_PopXTest(){
        assertTrue(stack.isEmpty());
        stack.push("bags");
        assertEquals("bags", stack.pop());
    }

    @Test
    public void pushXpushY_PopYTest() {
        assertTrue(stack.isEmpty());
        stack.push("bags");
        stack.push("shoes");
        assertEquals("shoes", stack.pop());
    }

    @Test
    public void pushXpushY_popY_Y_isReturnedTest(){
        assertTrue(stack.isEmpty());
        stack.push("bags");
        stack.push("shoes");
        assertEquals("shoes", stack.peek());
    }

    @Test
    public void throwExceptionToPopWhatDoesNotExistTest() {
        assertThrows(IllegalArgumentException.class, () -> stack.pop(), "Stack is Empty");
    }

    @Test
    public void pushXpushY_peakY_PushZ_Test(){
        assertTrue(stack.isEmpty());
        stack.push("bags");
        stack.push("shoes");
        stack.peek();
        stack.push("phone");
        stack.push("books");
        assertEquals("books", stack.peek());
    }



}