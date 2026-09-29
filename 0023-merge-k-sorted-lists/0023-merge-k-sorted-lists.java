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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> result = new ArrayList<>();
        for(ListNode head : lists)
        {
            while(head!=null)
            {
                result.add(head.val);
                head=head.next;
            }
        }

        Collections.sort(result);

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for(int val : result)
        {
            temp.next=new ListNode(val);
            temp=temp.next;
        }
        return dummy.next;
        
    }
}