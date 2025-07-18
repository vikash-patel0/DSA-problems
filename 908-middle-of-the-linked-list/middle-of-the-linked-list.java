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
    public ListNode middleNode(ListNode head) {
        int count=1,mid;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count%2==0){
            mid=(count/2)-1;
        }else{
            mid=count/2;
        }
        
        for(int i=1;i<=mid;i++){
            head=head.next;
        }
        return head;
    }
}