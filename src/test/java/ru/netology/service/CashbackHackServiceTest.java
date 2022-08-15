package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldBuyBelow1000 () {
        int buy = 1200;
        int actual = service.remain(buy);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldBuyUnder1000 () {
        int buy = 300;
        int actual = service.remain(buy);
        int expected = 700;

        assertEquals(actual, expected);
    }
    @Test
    public void ShouldBuyEqual1000 () {
        int buy = 1000;
        int actual = service.remain(buy);
        int expected = 0;

        assertEquals(actual, expected);
    }

}