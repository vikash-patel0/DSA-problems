/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<Integer> crit= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1) || arr.get(i)<arr.get(i-1) && arr.get(i)<arr.get(i+1)){
                crit.add(i+1);
            }
        }

        if(crit.size()==0 || crit.size()==1){
            return new int[]{-1,-1};
        }
        int min=arr.size();
        for(int i=1;i<crit.size();i++){
            if(min>crit.get(i)-crit.get(i-1)){
                min=crit.get(i)-crit.get(i-1);
            }
        }
        int max=crit.get(crit.size()-1)-crit.get(0);

        return new int[]{min,max};
    }
}