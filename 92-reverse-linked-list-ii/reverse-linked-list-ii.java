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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || head==null) return head;
        Stack<Integer> st = new Stack<>();
        ListNode temp=head;
        int count=1;
        ListNode dummy= new ListNode(0);
        ListNode newNode=dummy;
        while(temp!=null){
            if(count<left){
                newNode.next=new ListNode(temp.val);
                newNode=newNode.next;
            }
            if(count>=left && count<=right){
            st.push(temp.val);
            }
            count++;
            temp=temp.next;
            if(count==right+1){
                break;
            }
        }
        while(!st.isEmpty()){
            newNode.next=new ListNode(st.pop());
            newNode=newNode.next;
        }
        // ListNode temp1=head;
        // int count1=1;
        // while(temp1!=null){
        //     if(count1>right){
        //         newNode.next=new ListNode(temp1.val);
        //         newNode=newNode.next;
        //     }
        //     temp1=temp1.next;
        // }

        while(temp!=null){
            newNode.next=new ListNode(temp.val);
            newNode=newNode.next;
            temp=temp.next;
        }
        newNode.next=null;
        return dummy.next;
    }
}