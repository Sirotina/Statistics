package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {

        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;

    }

    public int monthMaxSales(long[] sales) {
        int maxmonth = 0;
        long maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxmonth = i;
                maxSales = sales[i];

            }

        }

        return maxmonth + 1;

    }

    public int monthMinSales(long[] sales) {
        int minmonth = 0;
        long minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minmonth = i;
                minSales = sales[i];

            }
        }
        return minmonth + 1;

    }


    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                counter++;

            }

        }
        return counter;

        }
    public int monthOverAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                counter++;

            }

        }
        return counter;

    }



    }