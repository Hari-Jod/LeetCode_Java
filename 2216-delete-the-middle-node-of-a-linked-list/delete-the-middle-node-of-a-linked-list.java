/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode temp = head;
        
        // Step 1: Count the total number of nodes in the list 🔢
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // Step 2: Handle edge case where list has only 1 node 🛑
        if (count == 1) {
            head = null;
            return head;
        }
        
        // Step 3: Advance to the node right BEFORE the middle node 🏁
        ListNode pos = head;
        for (int i = 1; i < count / 2; i++) {
            pos = pos.next;
        }
        
        // Step 4: Skip the middle node to delete it ✂️
        pos.next = pos.next.next;
        
        return head;
    }
}