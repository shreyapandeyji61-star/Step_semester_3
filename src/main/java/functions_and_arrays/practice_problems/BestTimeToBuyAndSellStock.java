package functions_and_arrays.practice_problems;

import java.util.Arrays;

/**
 * L2. Best Time to Buy and Sell Stock
 * 
 * Scenario: A trainee investor has one week of daily stock prices and wants to know
 * the single best day to buy and single best day to sell to make the largest profit.
 */
public class BestTimeToBuyAndSellStock {

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
        // Test Case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Input: prices = " + Arrays.toString(prices1));
        System.out.println("Output: " + maxProfit(prices1));

        // Test Case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Input: prices = " + Arrays.toString(prices2));
        System.out.println("Output: " + maxProfit(prices2));
    }
}
