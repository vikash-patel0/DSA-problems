class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int[] ans= new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> first= new Stack<>();
        Stack<Integer> second= new Stack<>();

        Stack<Integer> temp= new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!second.isEmpty() && nums[i]>nums[second.peek()]){
                int x = second.pop();
                ans[x]=nums[i];
            }
            while(!first.isEmpty() && nums[i]>nums[first.peek()]){
                temp.push(first.pop());
            }
            while (!temp.isEmpty()) {
                second.push(temp.pop());
            }
            first.push(i);
        }


        return ans;
    }
}
