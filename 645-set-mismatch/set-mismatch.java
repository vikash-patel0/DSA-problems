class Solution {
    public int[] findErrorNums(int[] nums) {
        int size=nums.length;
        int arr[] = new int[2];
        Arrays.sort(nums);
        int prevSum=0;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] == nums[i + 1]) { 
                arr[0] = nums[i];
            }
            prevSum+=nums[i];
        }
        prevSum+=nums[size - 1];
        prevSum-=arr[0];
        int actualSum=(size*(size+1))/2;
        arr[1]=actualSum-prevSum;

        return arr;
    }
}