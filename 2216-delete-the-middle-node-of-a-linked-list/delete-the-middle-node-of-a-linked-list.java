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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        int count=1;
        while(fast!=null && fast.next!=null){
            count++;
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=slow.next;
        ListNode prev=head;
        for(int i=2;i<count;i++){
            prev=prev.next;
        }
        prev.next=slow;
        return head;
    }
}