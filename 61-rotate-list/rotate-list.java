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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        for(int i=0;i<k%size;i++){
            ListNode m=head;
            ListNode temp1=head.next;
            while(temp1.next!=null){
                m=m.next;
                temp1=temp1.next;
            }
            m.next=null;
            temp1.next=head;
            head=temp1;
        }
        return head;
    }
}