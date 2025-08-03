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
        
        ListNode prev=head;
        ListNode curr=head.next;
        ArrayList<Integer> crit= new ArrayList<>();
        int count=1;
        while(curr.next!=null){
            count++;
            ListNode newNode=curr.next;
            if(curr.val>prev.val && curr.val>newNode.val || curr.val<prev.val && curr.val<newNode.val){
                crit.add(count);
            }
            prev=curr;
            curr=newNode;
        }

        if(crit.size()==0 || crit.size()==1){
            return new int[]{-1,-1};
        }

        int min=count;
        for(int i=1;i<crit.size();i++){
            if(min>crit.get(i)-crit.get(i-1)){
                min=crit.get(i)-crit.get(i-1);
            }
        }
        int max=crit.get(crit.size()-1)-crit.get(0);

        return new int[]{min,max};
    }
}



// no critcal point 
//one critical point