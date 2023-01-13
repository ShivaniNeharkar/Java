/* @author: Shivani Neharkar
   @date  : 11th January 2023 
   @topic : Sort Zeros Ones Twos without sorting tools  */
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.



class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0;
        int zeros=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeros++;
            }
            else{
                nums[pointer]=nums[i];
                pointer++;
            }
        }
        while(pointer<nums.length)
        {
            nums[pointer]=0;
            pointer++;
        }
    }
}