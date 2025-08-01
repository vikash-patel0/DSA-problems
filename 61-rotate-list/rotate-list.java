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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        Deque<Integer> arr= new ArrayDeque<>();
        ListNode temp=head;
        while(temp!=null){
            arr.offerLast(temp.val);
            temp=temp.next;
        }
        int size=arr.size();
        for(int i=0;i<k%size;i++){
            int x=arr.removeLast();
            arr.offerFirst(x);
        }
        ListNode dummy= new ListNode(0);
        ListNode newNode=dummy;
        for(int i=0;i<size;i++){
            newNode.next=new ListNode(arr.removeFirst());
            newNode=newNode.next;
        }
        newNode.next=null;
        return dummy.next;
    }
}