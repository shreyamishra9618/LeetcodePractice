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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        int carry =0;
        while(l1 != null || l2 != null){
            int result = carry;
            if(l1 != null){
                result +=l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                result += l2.val;
                l2 = l2.next;
            }
            ListNode node = new ListNode();
            node.val = result%10;
            l3.next = node;
            carry = result/10;
            l3 = l3.next;
        }
        if(carry > 0){
            ListNode newNode = new ListNode();
            newNode.val =1;
            l3.next = newNode;
        }
        return dummyHead.next;
    }
}