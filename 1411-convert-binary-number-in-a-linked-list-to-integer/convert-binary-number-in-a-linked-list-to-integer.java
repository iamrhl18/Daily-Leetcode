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
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;
        int val = head.val;
        head = head.next;
        while(head!=null){
            val = val*2 +(head.val);
            head = head.next;
        }
        return val;

    }
}