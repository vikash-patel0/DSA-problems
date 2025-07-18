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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode nextNode=head.next;
        while(nextNode!=null){
            head.next=prev;
            prev=head;
            head=nextNode;
            nextNode=nextNode.next;
        }
        head.next=prev;
        return head;
        
        // ListNode prev=null;
        // ListNode curr=head;
        // ListNode nextNode=curr.next;
        // while(nextNode!=null){
        //     curr.next=prev;
        //     prev=curr;
        //     curr=nextNode;
        //     nextNode=nextNode.next;
        // }
        // curr.next=prev;
        // return curr;
    }
}