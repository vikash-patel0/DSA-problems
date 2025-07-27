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
    public ListNode removeNodes(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
        ListNode m=curr.next;
            curr.next=prev;
            prev=curr;
            curr=m;
        }

        ListNode temp=prev;
        int max=Integer.MIN_VALUE;
        ListNode dummy= new ListNode(0);
        ListNode newNode = dummy;
        while(temp!=null){
            if(max<=temp.val){
                max=temp.val;
                newNode.next=temp;
                newNode=newNode.next;
            }
            temp=temp.next;
        }
        newNode.next=null;

        ListNode prev1=null;
        ListNode curr1=dummy.next;
        while(curr1!=null){
            ListNode m1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=m1;
        }

        return prev1;

    }
}