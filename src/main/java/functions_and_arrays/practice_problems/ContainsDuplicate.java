package functions_and_arrays.practice_problems;

import java.util.Arrays;

/**
 * Problem C1.3: Contains Duplicate
 *
 * Scenario:
 * Before finalizing an exam seating chart, the office must double-check that no roll number
 * was accidentally entered twice in the list.
 *
 * Task:
 * - Accept an integer array nums.
 * - Using two nested loops, compare every element at position i against every element at position j.
 * - Return true if any value appears at least twice; return false if every element is distinct.
 */
public class ContainsDuplicate {

    /**
     * Checks if array contains duplicate elements using pairwise nested loop comparison.
     *
     * @param nums array of numbers
     * @return true if duplicate exists, false otherwise
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem C1.3: Contains Duplicate ===");

        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Input:  nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + containsDuplicate(nums1));
        System.out.println("Expected: true");
        System.out.println();

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Input:  nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + containsDuplicate(nums2));
        System.out.println("Expected: false");
        System.out.println();
    }
}
