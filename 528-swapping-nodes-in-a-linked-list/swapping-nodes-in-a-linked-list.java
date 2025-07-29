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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null) return head;
        ListNode temp=head;
        ListNode prev=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count<k){
                prev=prev.next;
            }
            temp=temp.next;
        }
        ListNode temp2=head;
        ListNode prev2=head;
        int count2=0;
        while(temp2!=null){
            count2++;
            if(count2<count-k+1){
                prev2=prev2.next;
            }
            temp2=temp2.next;
        }
        int a=prev.val;
        prev.val=prev2.val;
        prev2.val=a;
        return head;
    }
}