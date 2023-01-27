package ru.netologe.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;

        }
        return result;
    }

    public long average(long[] sales) {
        long result = sum(sales);
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }

        }
        return monthMaximum + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMinimum = 0;
        long saleMinimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];
            }

        }
        return monthMinimum + 1;
    }

    public int calcMonthSaleBellowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthsWhichSalesAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }


}
