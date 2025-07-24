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
        if(head==null || head.next==null || head.next.next==null) return null;
        ListNode dummy= new ListNode(-1);
        ListNode res=dummy;
        int sum=0;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            }else{
                ListNode m = new ListNode(sum);
                res.next=m;
                res=res.next;
                sum=0;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
// sum all elements between zero and store as element.. repeat again after next zero
//using array size .. count-1 (for zeroes )