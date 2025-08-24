class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int i=0,j=0;
        int sum=0;
        int count=0;
        while(j!=nums.length && i!=nums.length-1){
            if(nums[j]==k) count++;
            sum+=nums[j];
            int sumT=sum;
            while(i!=j){
                if(sumT==k) count++;
                sumT-=nums[i];
                i++;
            }
            if(i==j){
                j++;
                i=0;
            }else{
                i++;
            }
        }

        return count;
    }
}



// int i=0,j=0;
//         int sum=0;
//         int count=0;
//         while(j<nums.length){
//             sum+=nums[j];
//             while(sum>goal && i<=j){
//                 sum -= nums[i];
//                 i++;
//             }

//             if(sum == goal) count++;
//             int ii = i;
//             while(ii<=j && nums[ii] == 0){
//                 ii++;
//                 // i++;
//                 count++;
//             }
//             j++;
//         }

//         return count;