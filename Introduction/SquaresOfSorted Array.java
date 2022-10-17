/*****
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*****/



class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1;
        int[] result = new int[nums.length];
        for(int n=j; n>=0; n--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[n] = nums[i] * nums[i];
                i++;
            } else {
                result[n] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
