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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
                   
                    }
                    if(fast!=null){
                        slow=slow.next;


                    }
                    ListNode prev=null;
                    ListNode current=slow;
                    while(current!=null){
                        ListNode next=current.next;
                        current.next=prev;
                        prev=current;
                        current=next;

                    }
                    ListNode first=head;
                    ListNode second=prev;
                    while(second!=null){
                        if(first.val!=second.val){
                            return false;

                        }
                        first=first.next;
                        second=second.next;

                    }
                    return true;


         }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna