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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        ListNode newNode1 = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode newNode2 = dummy2;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            if(count%2==0){
                newNode1.next= new ListNode(temp.val);
                newNode1=newNode1.next;
            }else{
                newNode2.next= new ListNode(temp.val);
                newNode2=newNode2.next;
            }
            temp=temp.next;
            count++;
        }
        newNode1.next=dummy2.next;
        return dummy1.next;
    }
}