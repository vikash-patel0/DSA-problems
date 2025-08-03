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
    public void reorderList(ListNode head) {
        if(head.next==null) System.out.print("["+head.val+"]");
        Stack<ListNode> st = new Stack<>();
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode forw=slow.next;
        slow.next=null;
        while(forw!=null){
            st.push(forw);
            forw=forw.next;
        }

        ListNode start=head;
        while(!st.isEmpty() && start!=null){
            ListNode sec= start.next;
            start.next=st.pop();
            start=start.next;
            start.next=sec;
            start=sec;
        }
    }
}