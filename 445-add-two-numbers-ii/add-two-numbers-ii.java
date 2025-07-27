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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode prev1=null;
        ListNode curr1=l1;
        while(curr1!=null){
            ListNode newNode1 = curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=newNode1;
        }
        ListNode prev2=null;
        ListNode curr2=l2;
        while(curr2!=null){
            ListNode newNode2 = curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=newNode2;
        }
        ListNode dummy= new ListNode(0);
        ListNode newNode3=dummy;
        int carry=0;
        while(prev1!=null && prev2!=null){
            int x=prev1.val+prev2.val+carry;
            if(x>9){
                carry=x/10;
                x%=10;
            }else{
                carry=0;
            }
            newNode3.next=new ListNode(x);
            newNode3 = newNode3.next;
            prev1=prev1.next; 
            prev2=prev2.next;
        }
        while(prev1!=null){
            int x=prev1.val+carry;
            if(x>9){
                carry=x/10;
                x%=10;
            }else{
                carry=0;
            }
            newNode3.next=new ListNode(x);
            newNode3 = newNode3.next;
            prev1=prev1.next;
        }
        while(prev2!=null){
            int x=prev2.val+carry;
            if(x>9){
                carry=x/10;
                x%=10;
            }else{
                carry=0;
            }
            newNode3.next=new ListNode(x);
            newNode3 = newNode3.next;
            prev2=prev2.next;
        }

        if (carry > 0) {
            newNode3.next = new ListNode(carry);
            newNode3 = newNode3.next;
        }

        ListNode prev3=null;
        ListNode curr3=dummy.next;
        while(curr3!=null){
            ListNode newNode4 = curr3.next;
            curr3.next=prev3;
            prev3=curr3;
            curr3=newNode4;
        }

        return prev3;
    }
}