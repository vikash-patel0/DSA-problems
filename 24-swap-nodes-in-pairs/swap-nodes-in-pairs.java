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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp1=head;
        ListNode temp2=head.next;
        while(temp2!=null){
            int a=temp1.val;
            temp1.val=temp2.val;
            temp2.val=a;
            if (temp2.next != null && temp2.next.next != null) {
                temp1 = temp1.next.next;
                temp2 = temp2.next.next;
            }else{
                break;
            }
        }
        return head;
    }
}