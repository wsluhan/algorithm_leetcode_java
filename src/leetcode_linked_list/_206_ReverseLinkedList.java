package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

class Solution206 {

    // Example [1,2,3]
    // (1) next = cur.next
    // null     1  -->  2  -->  3
    // prev     cur   next

    // (2) cur.next = prev
    // null  <--  1 --> 2  -->  3
    // prev      cur   next

    // (3) prev = cur, cur = next
    // null  <-- 1   --> 2 -->  3
    //          prev   cur

    // (4) repeat
    // null <---  1 <--- 2 <--- 3     null
    //                        prev    cur


    // Time complexity: O(n)
    // Space complexity: O(1)
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode prev = null;
        while (cur!= null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;

    }
}

public class _206_ReverseLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(8);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);

        n1.setNext(n2);
        n2.setNext(n3);

        Solution206 slt = new Solution206();
        ListNode res = slt.reverseList(n1);
        printLinkedList(res);

    }

    public static void printLinkedList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.getNext();
        }
    }
}
