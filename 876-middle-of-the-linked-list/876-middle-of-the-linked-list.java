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
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int size=0;
        // int count=0;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // if(size%2!=0){
        //     size=(size+1)/2;
        // }
        // else{
        //     size=(size+2)/2;
        // }
        // while(count<size-1){
        //     head=head.next;
        //     count++;
        // }
        // return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}