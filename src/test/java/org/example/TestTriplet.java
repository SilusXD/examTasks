package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTriplet
{
    @Test
    public void testTriplet()
    {
        Triplet<Integer> triplet = new Triplet<>(10, 20, 25);

        Assertions.assertTrue(triplet.containsObject(20));
        Assertions.assertFalse(triplet.containsObject(100));
        Assertions.assertFalse(triplet.containsObject(120));
        Assertions.assertTrue(triplet.containsObject(25));

        Assertions.assertEquals(10, triplet.findMinElement());
        Assertions.assertEquals(55, triplet.sumOfElements());
        Assertions.assertEquals("10 20 25", triplet.toString());
    }
}
