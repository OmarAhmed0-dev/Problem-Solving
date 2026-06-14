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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null || head == null) {
            head = null;
            return head;
        } 
        int size = 0;
        ListNode dummyHead = head;
        while(dummyHead != null) {
            size++;
            dummyHead = dummyHead.next;
        }
        
        if(size ==n) {
            return head.next;
        }

        ListNode temp  = head;
        int i = 1;
        while(i < size -n) {
            temp = temp.next;
            i++;
        }

           if(temp.next != null) {
            temp.next = temp.next.next;
           }        
        return head;        
    }
}