package ru.netologe.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 56, 17, 56, 80, 45, 38, 12, 11, 14, 14};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 56 + 17 + 56 + 80 + 45 + 38 + 12 + 11 + 14 + 14;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 56, 17, 56, 80, 45, 38, 12, 11, 14, 14};

        long actual = service.average(sales);
        long expected = (8 + 15 + 56 + 17 + 56 + 80 + 45 + 38 + 12 + 11 + 14 + 14) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaximumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 20, 20, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaxSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinimumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 20, 20, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinSale(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcMonthSaleBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 20, 20, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcMonthSaleBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthsWhichSalesAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 20, 20, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcMonthsWhichSalesAverage(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

}