package functions_and_arrays.practice_problems;

import java.util.Arrays;

/**
 * Problem C1.1: Two Sum
 *
 * Scenario:
 * A shopkeeper wants to find two items from a list of prices that together add up to exactly a customer's budget.
 *
 * Task:
 * - Accept an integer array nums, and an integer target.
 * - Using two nested loops, check every pair of different positions (i, j) in the array.
 * - If nums[i] + nums[j] equals target, return the two indices [i, j] immediately.
 */
public class TwoSum {

    /**
     * Finds indices of two numbers that add up to target using two nested loops.
     *
     * @param nums   input array of prices
     * @param target target budget
     * @return array of 2 indices [i, j]
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println("=== Problem C1.1: Two Sum ===");

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Input:  nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + Arrays.toString(twoSum(nums1, target1)));
        System.out.println("Expected: [0, 1]");
        System.out.println();

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Input:  nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + Arrays.toString(twoSum(nums2, target2)));
        System.out.println("Expected: [1, 2]");
        System.out.println();
    }
}
