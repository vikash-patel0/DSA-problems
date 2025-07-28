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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        ListNode dummy=new ListNode(0);
        ListNode newNode = dummy;
        ListNode temp=head;
        while(temp!=null){
            if(!set.contains(temp.val)){
                newNode.next=temp;
                newNode=newNode.next;
            }
            temp=temp.next;
        }
        newNode.next=null;
        return dummy.next;
    }
}