class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int maj=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                maj=nums[i];
            }
            if(maj==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return maj;
    }
}

//The Boyer-Moore Voting Algorithm
//majority elements cancels out others
//logic is that maj element is always greater in number than rest elements all together
// so we are basically cancelling that many times a maj element.. if different number appears
// at the end one or more ocurrence of maj element will be left
// we take count as 0 in starting and take starting number as our maj element
// then we will be increasing count as we see duplicate of maj element and decrement count if we see different element... as count becomes zero that means we will assign next element as maj element and start doing operation again 