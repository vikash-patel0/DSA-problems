class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0,candidate1=0,candidate2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }else if(nums[i]==candidate2){
                count2++;
            }else if(count1==0){
                candidate1=nums[i];
                count1++;
            }else if(count2==0){    
                candidate2=nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        List<Integer> list= new ArrayList<>();
        count1=count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1) count1++;
            if(nums[i]==candidate2) count2++;
        }
        if(count1>nums.length/3) list.add(candidate1);
        if(count2>nums.length/3 && candidate1!=candidate2) list.add(candidate2);

        return list;

    }
}


//basically we are doing is same as first problem but there candidate was one..
// so if any one candidate is having more votes he wins

//here we have two chair and two winner candidates
// we will firstlty assign chair to each different candidate
// if anyone of the same element comes same as candidate or chairperson
//then we will increment the vote based on either of two
//but if someone who is different from both .. then both votes will be deducted 
// just to compare other votes with them .. 
// and if candidate votes goes to zero then the next person(who is not same as the candidate ) who will come will become the candidate in place .. who recently got zero count 
// like this candidate will keep getting updated and at the end two candidates who are at the seat will be winner
//but here is a catch.. not always there is two candidate.. there might be cases in which there is only one candidate...
//maybe when we were doing voting part.. some random candidate having one vote sat at the end.. so he will be fake winner
// thats why we need to verify if both are candidates are having count more than n/3
// those who are having count more than n/3 will be added to the list