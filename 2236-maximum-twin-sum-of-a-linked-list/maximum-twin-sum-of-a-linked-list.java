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
    public int pairSum(ListNode head) {
        Stack<ListNode> st= new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        int count=0;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            count++;
        }
        while(slow!=null){
            st.push(slow);
            slow=slow.next;
        }

        int min=0;
        int max=0;
        for(int i=0;i<count;i++){
            min=temp.val+st.pop().val;
            max=Math.max(max,min);
            temp=temp.next;
        }
        return max;
    }
}