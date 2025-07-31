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
        if(head==null) return head;
        ListNode temp=head;
        int a=head.val;
        while(temp.next!=null){
            if(temp.next.val>=5){
                temp.val=(temp.val*2+1)%10;
            }else{
                temp.val=(temp.val*2)%10;
            }
            temp=temp.next;
        }
        if(temp.next==null){
            temp.val=(temp.val*2)%10;
        }
        if(a>=5){
            ListNode newNode= new ListNode(1);
            newNode.next=head;
            return newNode;
        }
        return head;
    }
}