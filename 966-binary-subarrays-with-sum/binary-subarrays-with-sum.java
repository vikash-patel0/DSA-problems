class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        Map<Integer,Integer> prefixSumFreq= new HashMap<>();
        int count=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum==k) count++;
            if(prefixSumFreq.containsKey(currSum-k)){
                count+=prefixSumFreq.get(currSum-k);
            }
            if(prefixSumFreq.containsKey(currSum)){
                prefixSumFreq.put(currSum,prefixSumFreq.get(currSum)+1);
            }else{
                prefixSumFreq.put(currSum,1);
            }
        }
        return count;
    }
}
