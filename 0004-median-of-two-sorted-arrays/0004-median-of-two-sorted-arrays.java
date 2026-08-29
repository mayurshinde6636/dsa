import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length + nums2.length];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            temp[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            temp[nums1.length + i] = nums2[i];
        }

        // Sort merged array
        Arrays.sort(temp);

        int n = temp.length;

        // Odd
        if (n % 2 == 1) {
            return temp[n / 2];
        }

        // Even
        return (temp[n / 2 - 1] + temp[n / 2]) / 2.0;
    }
}