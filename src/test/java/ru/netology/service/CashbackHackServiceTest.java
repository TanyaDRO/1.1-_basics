package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldHaveRemain() {
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotRemain() {
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}