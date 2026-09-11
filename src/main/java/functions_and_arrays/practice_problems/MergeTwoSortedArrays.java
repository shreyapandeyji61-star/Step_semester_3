package functions_and_arrays.practice_problems;

import java.util.Arrays;

/**
 * Problem C1.4: Merge Two Sorted Arrays
 *
 * Scenario:
 * Two class sections each submit their exam scores already sorted from lowest to highest.
 * Merge them into one single combined sorted list without re-sorting from scratch.
 *
 * Task:
 * - Accept two sorted integer arrays, arr1 and arr2.
 * - Use two-pointer approach starting at 0 for both arrays.
 * - Compare elements, copy smaller to result array, and advance pointer.
 * - Copy remaining elements from non-empty array into result.
 */
public class MergeTwoSortedArrays {

    /**
     * Merges two sorted integer arrays into a single sorted array.
     *
     * @param arr1 first sorted array
     * @param arr2 second sorted array
     * @return merged sorted array
     */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null) return arr2 != null ? arr2.clone() : new int[]{};
        if (arr2 == null) return arr1.clone();

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem C1.4: Merge Two Sorted Arrays ===");

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println("Input:  arr1 = " + Arrays.toString(arr1) + ", arr2 = " + Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(mergeSortedArrays(arr1, arr2)));
        System.out.println("Expected: [1, 2, 3, 4, 5, 6]");
        System.out.println();

        int[] a1 = {1};
        int[] a2 = {1, 2, 3};
        System.out.println("Input:  arr1 = " + Arrays.toString(a1) + ", arr2 = " + Arrays.toString(a2));
        System.out.println("Output: " + Arrays.toString(mergeSortedArrays(a1, a2)));
        System.out.println("Expected: [1, 1, 2, 3]");
        System.out.println();
    }
}
