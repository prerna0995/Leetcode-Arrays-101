/*****
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
*****/


class Solution {
    
    //O(n2) 
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j=arr.length-1;j>i;j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        
    }
    
    //O(n)
    public void duplicateZeros(int[] arr) {
        int numOfZeros = findCount(arr);
        int i = arr.length - 1;
        int j = arr.length + numOfZeros - 1;
        while( i >= 0 && j >= 0){
            if(j < arr.length){
                arr[j] = arr[i];
            } 
            j--;
            if(arr[i] == 0){
                if(j < arr.length){
                    arr[j] = arr[i];
                } 
                j--;
            }
            i--;
        }
        
    }
    int findCount(int[] arr){
        int count = 0;
        for(int a: arr){
            count += a == 0 ? 1 : 0;
        }
        return count;
    }
}
