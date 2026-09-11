package functions_and_arrays.practice_problems;

import java.util.Arrays;

/**
 * Problem C1.5: Rotate Array
 *
 * Scenario:
 * A playlist needs to be shifted so the last few songs move to the front of the queue,
 * rotating the whole list to the right by k positions.
 *
 * Task:
 * - Accept integer array nums and integer k.
 * - Reduce k using k = k % nums.length.
 * - Calculate new position for index i: (i + k) % length.
 * - Return rotated array.
 */
public class RotateArray {

    /**
     * Rotates an array to the right by k steps.
     *
     * @param nums array of numbers
     * @param k    number of positions to rotate right
     * @return new rotated array
     */
    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int n = nums.length;
        k = k % n;
        if (k == 0) {
            return nums.clone();
        }

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem C1.5: Rotate Array ===");

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println("Input:  nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output: " + Arrays.toString(rotateArray(nums1, k1)));
        System.out.println("Expected: [5, 6, 7, 1, 2, 3, 4]");
        System.out.println();

        int[] nums2 = {1, 2};
        int k2 = 5;
        System.out.println("Input:  nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output: " + Arrays.toString(rotateArray(nums2, k2)));
        System.out.println("Expected: [2, 1]");
        System.out.println();
    }
}
