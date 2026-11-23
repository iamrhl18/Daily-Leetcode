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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode trav = head;
        ListNode uniq = head;
        while(trav != null){
            int val = trav.val;
            while(trav.next !=null && trav.next.val ==val){
                trav =trav.next;
            }
            trav = trav.next;
            uniq.next = trav;
            uniq = uniq.next;
        }
        return head;
    }
}