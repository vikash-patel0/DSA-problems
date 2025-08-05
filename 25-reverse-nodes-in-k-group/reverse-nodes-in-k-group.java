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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy= new ListNode(0,head);
        ListNode tail = dummy;

        while(true){
            ListNode kth=tail;
            for(int i=0;i<k && kth!=null ;i++){
                kth=kth.next;
            }
            if(kth==null) break;

            ListNode groupStart = tail.next;
            ListNode nextgroupStart = kth.next;

            ListNode prev = nextgroupStart;
            ListNode curr = groupStart;
            while(curr!=nextgroupStart){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            tail.next=kth;
            tail=groupStart;
        }
        return dummy.next;

    }
}
