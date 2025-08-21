class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                nums[i] = -1;
            }
        }
        int sum=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (map.containsKey(sum)) {
                int lent = i - map.get(sum);
                if(len<lent) len=lent;
            } else {
                map.put(sum, i);
            }
        }
        return len;
     }
}
// above approach makes all 0 as negative -1
// and stores sum and its index inside map
// then checks if sum is already there .. that means from that index .. sum is 0.. that's why still the same 
// then updates length if prev length is smaller.. length are only updated.. if subarray sum .. i.e difference has zero sum .... 


//new thought
// we can have sum = half length of subarray
// max--> sum

// int[] prefix= new int[nums.length];
//         int max=0;
//         int max2=0;
//         prefix[0]=nums[0];
//         for(int i=1;i<nums.length;i++){
//             prefix[i]=nums[i]+prefix[i-1];
//             if(prefix[i]==(i+1)/2 && max<max2){
//                 max2=max;
//                 max=prefix[i];
//             }
//         }
//         for(int i=1;i<prefix.length;i++){
//             int rangeSum=prefix[nums.length-1]-prefix[i-1];
//             if(rangeSum==(nums.length-i)/2 && max<max2){
//                 max2=max;
//                 max=rangeSum;
//             }
//         }
//         return max;






//wrong thought (understand question properly)
// i thought to track continous zeroes and ones

// int count=1;
//         int count2=0;
//         int max=0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]!=nums[i-1]){
//                 max=(count>count2)?count2:count;
//                 count2=count;
//                 count=1;
//             }else{
//                 count++;
//             }
            
//         }
//         if(count<count2 && max<count){
//             max=count;
//         }
//         if(count2<count && max<count2){
//             max=count2;
//         }
//         return max*2;