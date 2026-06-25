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
        int length =0;
        ListNode temp = head;
        while(temp.next != null){
            length++;
            temp = temp.next;
        } 
        ListNode pred = reverse(head);
        ListNode first = get(pred , k,length);
        return first;
    }
    public ListNode reverse(ListNode head ){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode get(ListNode head, int k,int length){
         k = k% length;
        ListNode first = head;
        ListNode temp = head;
        for(int i =1;i<k;i++){
            temp = temp.next;
        }
        ListNode second = temp.next;
        temp.next = null;

        first = reverse(first);
        second = reverse(second);

        ListNode t = first;
        while(t.next!= null){
            t = t.next;
        }
        t.next = second;
        return first;
    }
}