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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if(list1==null) return list2;
        // if(list2==null) return list1;

        // ListNode prev=null;
        // ListNode next=list1;
        // ListNode temp=list2;
        // while(temp!=null){
        //     if(next.val>=temp.val){
        //         prev.next=temp;
        //         temp.next=next;
        //     }else{
        //         ListNode hola=next.next;
        //         next.next=temp;
        //         temp.next=hola;
        //     }
        //     prev=next;
        //     next=next.next;
        //     list2=list2.next;
        //     temp=list2;
        // }
        // return list1;


        Queue<ListNode> qu= new LinkedList<>();

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                qu.offer(list1);
                list1 = list1.next;
            } else {
                qu.offer(list2);
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            qu.offer(list1);
            list1 = list1.next;
        }
        while (list2 != null) {
            qu.offer(list2);
            list2 = list2.next;
        }
        qu.offer(null);


        ListNode head = new ListNode(-1);
        head=qu.poll();
        ListNode tail = head;

        while (!qu.isEmpty()) {
            tail.next = qu.poll();;
            tail = tail.next;
        }
        return head;
    }
}