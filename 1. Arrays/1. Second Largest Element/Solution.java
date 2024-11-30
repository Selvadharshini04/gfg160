--------------------------------------------------------------------------------------------------------------------------------------------------------------
Question:
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

---------------------------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int first=-1,second=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]< first && arr[i]>second){
                second=arr[i];
            }
        }
        return second;
    }
}
