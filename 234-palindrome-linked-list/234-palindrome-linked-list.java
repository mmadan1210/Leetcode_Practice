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
    
    public ListNode mid(ListNode head){
        if(head==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode rev(ListNode head){
        ListNode cur = head, prev = null;
		while(cur != null) {
			ListNode temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode m = mid(head);
        ListNode r = rev(m);
        ListNode left = head;
        ListNode right = r;
        while(left!=null && right!=null){
            if(left.val!=right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
}