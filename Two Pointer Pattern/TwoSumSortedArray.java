//Two sum when Input Array is Sorted using Two Pointer Pattern

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
       int[] arr = {2, 7, 11, 15};
       int target = 18;
       int[] result = twoSum(arr, target);
       System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target)
                return new int[] {l + 1, r + 1}; 
            else if (sum < target)
                l++;  
            else
                r--;  
        }
        return new int[2];
    }

}