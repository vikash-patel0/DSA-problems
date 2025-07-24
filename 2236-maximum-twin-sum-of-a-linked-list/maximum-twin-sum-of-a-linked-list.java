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
        Deque<ListNode> arr = new ArrayDeque<>();
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            arr.offerLast(temp);
            temp=temp.next;
        }
        int min=0;
        int max=0;
        int mid=arr.size()/2;
        for(int i=0;i<mid;i++){
            min=arr.removeFirst().val+arr.removeLast().val;
            if(max<min){
                max=min;
            }
        }
        return max;
        
    }
}