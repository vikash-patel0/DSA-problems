class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];

        int prefix=1; // in first pass we will just calculate left side multiplication in res arr
        // prefix taken as 1 because there is not element before first index
        for(int i=0;i<nums.length;i++){
            res[i]=prefix;
            prefix*=nums[i];        
        }

        int suffix=1; // in second pass we will just calculate right side multiplication in res 
        // suffix taken as 1 because there is not element after last index
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=suffix;
            suffix*=nums[i];
        }

        return res;
    }
}

// O(n) time and O(1)