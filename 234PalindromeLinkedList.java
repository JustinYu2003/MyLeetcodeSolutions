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

//First attempt, 
public boolean isPalindrome(ListNode head) {
        //Get to the middle node of the linked list, upper middle if length of list is even
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Check list length, if odd, then get rid of middle node as it doesnt matter
        if(fast != null) {
            slow = slow.next;
        }
        
        //Reverse the right half of the list 
        ListNode reverseToMid = null;
        while(slow != null) {
            ListNode next = slow.next;
            slow.next = reverseToMid;
            reverseToMid = slow;
            slow = next;
        }
        
        //Compare the right half and left half
        while(reverseToMid != null) {
            if(reverseToMid.val != head.val) {
                return false;
            }
            reverseToMid = reverseToMid.next;
            head = head.next;
        }
        //Return true if its passed the check
        return true;
}