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
    public ListNode doubleIt(ListNode head) {
        if(head==null || head.val==0) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=head.next;
        while(temp!=null){
            curr.next=prev;
            prev=curr;
            curr=temp;
            temp=temp.next;
        }
        curr.next=prev;


        ListNode temp1=curr;
        int carry=0;
        while(temp1!=null){
            int x= temp1.val*2+carry;
            temp1.val=x%10;
            carry=x/10;
            temp1=temp1.next;
        }


        ListNode prev2=null;
        ListNode curr2=curr;
        ListNode temp2=curr.next;
        while(temp2!=null){
            curr2.next=prev2;
            prev2=curr2;
            curr2=temp2;
            temp2=temp2.next;
        }
        curr2.next=prev2;
        if(carry!=0){
        ListNode newNode= new ListNode(carry);
        newNode.next=curr2;
        return newNode;
        }

            return curr2;
    }
}