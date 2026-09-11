package functions_and_arrays.practice_problems;

import java.util.Arrays;

/**
 * L3. Contains Duplicate
 * 
 * Scenario: Double-check that no roll number was accidentally entered twice in the seating chart.
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
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
        // Test Case 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + containsDuplicate(nums1));

        // Test Case 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + containsDuplicate(nums2));
    }
}
