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
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> arr=new ArrayDeque<>();
        ListNode temp=head;
        while(temp!=null){
            arr.offerLast(temp);
            temp=temp.next;
        }
        boolean flag=true;
        int size=arr.size()/2;
        for(int i=0;i<size;i++){
            if(arr.pollFirst().val!=arr.pollLast().val){
                flag=false;
            }
        }
        return flag;
    }
}