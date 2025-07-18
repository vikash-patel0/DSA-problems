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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> box= new Stack<>();
        box.push(null);
        if(head==null || head.next==null){
            return head;
        }

        while(head!=null){
            box.push(head);
            head=head.next;
        }

        head=box.pop();
        ListNode temp=head;
        while(!box.isEmpty()){
            temp.next=box.pop();
            temp=temp.next;
        }
        //temp.next=null;
        return head;
    }
}