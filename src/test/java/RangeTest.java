import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    static Range r1;
    static Range r2;
    static Range r3;
    static Range r4;

    @BeforeAll
    static void init(){
        r1 = new Range(1, 5);
        r2 = new Range(-4, 2);
        r3 = new Range(5, 20);
        r4 = new Range(7, 12);
    }

    @Test
    void getLowerBound() {
        assertEquals(1, r1.getLowerBound());
        assertEquals(-4, r2.getLowerBound());
        assertEquals(5, r3.getLowerBound());
        assertEquals(7, r4.getLowerBound());
    }

    @Test
    void getUpperBound() {
        assertEquals(5, r1.getUpperBound());
        assertEquals(2, r2.getUpperBound());
        assertEquals(20, r3.getUpperBound());
        assertEquals(12, r4.getUpperBound());
    }

    @Test
    void isConcurrent() {
        assertTrue(r1.isConcurrent(new Range(1 ,5)));
        assertFalse(r1.isConcurrent(r2));
        assertFalse(r3.isConcurrent(r4));
    }

    @Test
    void isBefore() {
        assertTrue(r2.isBefore(r3));
        assertFalse(r1.isBefore(r3));
        assertFalse(r3.isBefore(r4));
    }

    @Test
    void isAfter() {
        assertTrue(r3.isAfter(r2));
        assertFalse(r3.isAfter(r1));
        assertFalse(r4.isAfter(r3));
    }

    @Test
    void contains() {
        assertTrue(r3.contains(7));
        assertTrue(r3.contains(5));
        assertFalse(r1.contains(100));
    }

    @Test
    void asList() {
    }

    @Test
    void asIterator() {
    }
}