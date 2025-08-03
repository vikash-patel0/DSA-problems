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
                newNode1.next=temp;
                newNode1=newNode1.next;
            }else{
                newNode2.next=temp;
                newNode2=newNode2.next;
            }
            temp=temp.next;
        }
        newNode2.next=null;
        newNode1.next=dummy2.next;
        return dummy1.next;
    }
}