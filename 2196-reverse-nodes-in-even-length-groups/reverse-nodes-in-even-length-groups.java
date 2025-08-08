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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode tail = dummy;
        int group = 1;

        while (tail.next != null) {

            ListNode groupStart = tail.next;
            ListNode groupEnd = tail;
            int count = 0;

            for (int i = 0; i < group && groupEnd.next != null; i++) {
                groupEnd = groupEnd.next;
                count++;
            }
            ListNode nextGroupStart = groupEnd.next;

            if (count % 2 == 0) {

                ListNode prev = nextGroupStart;
                ListNode curr = groupStart;
                for (int i = 0; i < count; i++) {
                    ListNode next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                tail.next = groupEnd;
                tail = groupStart;
            } else {
                tail = groupEnd;
            }
            group++;
        }
        return dummy.next;
    }
}


// 1
// 123
// 123456
// 1234567890

// 1
// 1+2 =3 
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15
// 1+2+3+4+5+6=21

// n(n+1)/2 
// (n*(n+1))/2

// n%2!=0
// n%2==0