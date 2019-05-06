package ua.org.crazy.homework19.task01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    private static final Integer INVALID_INDEX = -5;
    private static final Integer VALID_INDEX = 1;
    private static final Integer FIRST_VALUE_INDEX = 0;
    private static Integer LAST_VALUE_INDEX;
    private static Integer MIDDLE_VALUE_INDEX;
    private MyArrayList<Integer> list;

    @Before
    public void init() {
        list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        LAST_VALUE_INDEX = list.size() - 1;
        MIDDLE_VALUE_INDEX = 3;
    }

    @After
    public void clear() {
        list.clear();
    }

    @Test
    public void methodRemoveShouldRemoveFirstValue() {
        Integer expected = list.get(FIRST_VALUE_INDEX);
        Integer actual = list.remove(FIRST_VALUE_INDEX);
        assertEquals(expected, actual);
    }

    @Test
    public void methodRemoveShouldRemoveLastValue() {
        Integer expected = list.get(LAST_VALUE_INDEX);
        Integer actual = list.remove(LAST_VALUE_INDEX);
        assertEquals(expected, actual);
    }

    @Test
    public void methodRemoveShouldRemoveMiddleValue() {
        Integer expected = list.get(MIDDLE_VALUE_INDEX);
        Integer actual = list.remove(MIDDLE_VALUE_INDEX);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void methodValidateIndexShouldThrowExceptionIfInvalidIndex() {
        list.get(INVALID_INDEX);
    }

    @Test
    public void methodValidateIndexShouldDoNothingIfValidIndex() {
        list.get(VALID_INDEX);
    }
}
