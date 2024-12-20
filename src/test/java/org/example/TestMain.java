package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.example.Main;

import java.util.Scanner;

public class TestMain
{
    @Test
    public void testGetMonth()
    {
        Assertions.assertTrue(Main.getMonth(1));
        Assertions.assertFalse(Main.getMonth(0));
        Assertions.assertTrue(Main.getMonth(12));
    }

    @Test
    public void testSum()
    {
        Assertions.assertEquals(3, Main.sum(1, 2));
        Assertions.assertEquals(102, Main.sum(100, 2));
        Assertions.assertEquals(0, Main.sum(-1, 1));
    }
}
