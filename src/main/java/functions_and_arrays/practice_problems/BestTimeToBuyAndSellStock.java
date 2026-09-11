package functions_and_arrays.practice_problems;

import java.util.Arrays;

/**
 * Problem C1.2: Best Time to Buy and Sell Stock
 *
 * Scenario:
 * A trainee investor has one week of daily stock prices and wants to know the single best day to buy
 * and the single best day to sell, to make the largest possible profit.
 *
 * Task:
 * - Accept an integer array prices, where prices[i] is the price on day i.
 * - Walk through the array once, keeping track of the lowest price seen so far.
 * - At each day, calculate profit = price - lowest price seen so far.
 * - Return maximum profit, or 0 if prices only fall.
 */
public class BestTimeToBuyAndSellStock {

    /**
     * Calculates maximum profit from buying and selling stock in one pass.
     *
     * @param prices daily stock prices
     * @return maximum achievable profit
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem C1.2: Best Time to Buy and Sell Stock ===");

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Input:  prices = " + Arrays.toString(prices1));
        System.out.println("Output: " + maxProfit(prices1));
        System.out.println("Expected: 5");
        System.out.println();

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Input:  prices = " + Arrays.toString(prices2));
        System.out.println("Output: " + maxProfit(prices2));
        System.out.println("Expected: 0");
        System.out.println();
    }
}
