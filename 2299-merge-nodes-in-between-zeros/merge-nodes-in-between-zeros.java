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
    public ListNode mergeNodes(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode res=head;
        ListNode temp=head.next;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                res.next=temp;
                temp.val=sum;
                res=res.next;
                sum=0;
            }else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return head.next;
    }
}