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

//Iterative solution
public ListNode reverseList(ListNode head) {
    //Check if the list is empty or only has 1 node, base case
    if(head == null || head.next == null) {
        return head;
    }
    //If 2 or more nodes
    ListNode newHead = null;
    //Iterate through the linked list
    while(head != null) {
        ListNode nextNodes = head.next;
        head.next = newHead;
        newHead = head;
        head = nextNodes;
    }
    //Return the new head
    return newHead;
}