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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next==null) {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode temp=curr.next;
        while(temp!=null){
            curr.next=prev;
            prev=curr;
            curr=temp;
            temp=temp.next;
        }
        curr.next=prev;

        ListNode start=head;
        while( start!=null && curr!=null){
            ListNode sec= start.next;
            start.next=curr;
            curr=curr.next;
            start=start.next;
            start.next=sec;
            start=sec;
        }
    }
}