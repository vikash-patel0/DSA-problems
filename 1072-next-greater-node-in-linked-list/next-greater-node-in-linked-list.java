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

        ArrayList<Integer> arr= new ArrayList<>();
        Deque<Integer> st = new ArrayDeque<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int[] res= new int[arr.size()];
        for(int i=arr.size()-1;i>=0;i--){
            while(!st.isEmpty() && st.peekLast()<=arr.get(i)){
                st.removeLast();
            }
            if(st.isEmpty()){
                res[i]=0;
            }else{
                res[i]=st.peekLast();
            }
                st.offerLast(arr.get(i));
        }
        return res;
    }
}