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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list2==null) return list1;
        // int count=0;
        // ListNode temp=list1;
        // ListNode oldlist=list1;
        // while(temp!=null){
        //     if(count>=a-1){
        //         if(list2.next!=null){
        //         temp.next=list2;
        //         list2=list2.next;
        //         temp=temp.next;
        //         }else{
        //         temp.next=list2;
        //         list2.next=oldlist;
        //         }
                
        //     }else{
        //         temp=temp.next;
        //     }
        //     if(count<=b+1){
        //     oldlist=oldlist.next;
        //     }
        //     count++;
        // }
        ListNode temp=list1;
        for(int i=0;i<a-1;i++){
            temp=temp.next;
        }
        ListNode end=temp;
        for(int i=0;i<=(b-a)+1;i++){
            end=end.next;
        }
        while(list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        temp.next=end;
        return list1;
    }
}