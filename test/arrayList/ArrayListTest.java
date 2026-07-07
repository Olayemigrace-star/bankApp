package arrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
        @Test
        public void newArray_isEmptyTest(){
            ArrayList arrayList = new ArrayList();
            assertTrue(arrayList.isEmpty());
        }
    @Test
    public void addElementToEmptyArrayList_ArrayListIsNotEmptyTest(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("pencil");
        assertFalse(arrayList.isEmpty());
    }
    @Test
    public void addElementX_removeElementX_ArrayListIsEmptyTest(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("orange");
        arrayList.remove();
        assertTrue(arrayList.isEmpty());
    }
    @Test
    public void addElementX_removeElementX_ReturnsElementRemovedTest(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("orange");
        assertEquals("orange", arrayList.remove());
    }

    @Test
    public void addXYAndReturnCountTest(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("jotter");
        arrayList.add("marker");
        arrayList.size();
        assertEquals(2, arrayList.size());
    }
    @Test
    public void addXYRemoveYReturnCountTest(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("pencil");
        arrayList.add("eraser");
        arrayList.remove();
        arrayList.size();
        assertEquals(1, arrayList.size());
    }
    @Test
    public void addXYCheckIndexAtYTest(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("pencil");
        arrayList.add("eraser");
        arrayList.index();
        assertEquals(1, arrayList.index());
    }
    @Test
    public void addXYCheckThenCheckASpecifiedIndexTest(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
        arrayList.add("pencil");
        arrayList.add("eraser");
        assertEquals("pencil", arrayList.set(0));
    }
    }
