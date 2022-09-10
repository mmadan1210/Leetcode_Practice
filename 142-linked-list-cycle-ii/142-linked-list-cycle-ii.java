public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head==null || head.next==null) 
        //     return null;
        // ListNode slow = head;
        // ListNode fast = head;
        // ListNode start = head;
        // while(fast.next!=null && fast.next.next!=null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        //     if(slow==fast){
        //         ListNode meet = slow;
        //         while(start!=meet){
        //             start= start.next;
        //             meet= meet.next;
        //         }
        //         return start;
        //     }
        // }
        // return null;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if(head==null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode meet = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast) {
                 while(meet!=slow){
                    meet= meet.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        
        
        return null;
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
}