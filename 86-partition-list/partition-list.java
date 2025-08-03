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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode dummy1= new ListNode(0);
        ListNode newNode1 = dummy1;
        ListNode dummy2= new ListNode(0);
        ListNode newNode2 = dummy2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                newNode1.next=new ListNode(temp.val);
                newNode1=newNode1.next;
                temp=temp.next;
            }else{
                newNode2.next=new ListNode(temp.val);
                newNode2=newNode2.next;
                temp=temp.next;
            }
        }
        if(dummy1.next==null) return dummy2.next;
        ListNode temp1= dummy1.next;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=dummy2.next;
        return dummy1.next;
    }
}