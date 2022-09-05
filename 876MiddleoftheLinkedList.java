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

//First attempt, brute forced
public ListNode middleNode(ListNode head) {
        //Don't have to check for an empty list so we can start counter at 1
        int counter = 1;
        ListNode currNode = head;
        //Iterate through the nodes until the next node is null to record the list length
        while(currNode.next != null) {
            counter++;
            currNode = currNode.next;
        }
        //Divide the length by 2 because java rounds integer division down, 
        counter/=2;
        currNode = head;
        //then iterate that many times through the list and return that node
        for(int i = 0; i < counter; i++) {
            currNode = currNode.next;
        }
        return currNode;
}

//Second attempt, one pointer goes twice as fast as the other one, 
//so when the faster one reaches end, slower one in middle
public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        }
        return slow;
}