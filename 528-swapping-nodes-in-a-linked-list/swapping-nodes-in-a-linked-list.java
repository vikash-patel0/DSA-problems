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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev=head;
        ListNode forward=head;
        for(int i=2;i<=k;i++){
            forward=forward.next;
        }
        ListNode first=forward;
        while(forward.next!=null){
            prev=prev.next;
            forward=forward.next;
        }
        ListNode second=prev;
        int temp=first.val;
        first.val=second.val;
        second.val=temp;

        return head;
    }
}