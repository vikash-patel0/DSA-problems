class Solution {
    public void wiggleSort(int[] nums) {
        int maxindex=nums.length-1;
        int[] arr= Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        for(int i=1;i<nums.length;i+=2){
            nums[i]=arr[maxindex--];
        }
        for(int i=0;i<nums.length;i+=2){
            nums[i]=arr[maxindex--];
        }
        
    }
}
