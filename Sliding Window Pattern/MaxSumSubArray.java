//Maximum Sub Array Sum Using Sliding Window Pattern

import java.lang.Integer;
import java.lang.Math;

class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 9, 31, -4, 21, 7};
        int k = 3;
        maxSum(arr, k);
    }

    public static void maxSum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum += windowSum;

        for(int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(windowSum, maxSum);
        }

        System.out.println("The Maximum Sum of the Sub Array with in the range " + k + " is : " + maxSum);
    }
}