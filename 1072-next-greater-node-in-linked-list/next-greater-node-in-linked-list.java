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
    public int[] nextLargerNodes(ListNode head) {

        if(head.next==null) return new int[]{0};
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] arr= new int[count];
        ListNode prev=head;
        for(int i=0;i<count-1;i++){
        ListNode forw=prev.next;
            for(int j=i;j<count-1;j++){
                // if(forw.next!=null){}
                if(prev.val<forw.val){
                    arr[i]=forw.val;
                    break;
                }else{
                    arr[i]=0;
                }
                    forw=forw.next;
            }
            prev=prev.next;
        }
        
        return arr;
    }
}