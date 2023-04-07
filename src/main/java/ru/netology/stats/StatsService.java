package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long avrg(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSale(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];

            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int saleBelowAvrg(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < avrg(sales)) {
                result++;
            }
        }
        return result;
    }

    public int saleHigherAvrg(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > avrg(sales)) {
                result++;
            }
        }
        return result;
    }
}
