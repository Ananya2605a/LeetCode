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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }

        ListNode temp = head;
        int len=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            len++;
        }

        
       
        if(k%len==0)
        {
            
            return head;
        }
         k=k%len;

         temp.next=head;
        
        int steps=len-k-1;
        ListNode newtail = head;
        for(int i=0;i<steps;i++)
        {
            newtail=newtail.next;
        }
        ListNode newHead = newtail.next;
        newtail.next=null;
        return newHead;
        
    }
}