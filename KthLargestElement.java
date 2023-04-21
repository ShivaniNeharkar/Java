/* @author: Shivani Neharkar
   @date  : 20th April 2023 
   @topic : 215. Kth Largest Element in an Array
 
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
You must solve it in O(n) time complexity..*/


import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
