package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode();
        ListNode cur = pre;
        int plusOne = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + plusOne;
            cur.next = new ListNode(sum % 10);
            plusOne = sum < 10 ? 0 : 1;

            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (plusOne == 1) cur.next = new ListNode(1);

        return pre.next;
    }
}

public class _2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);

        ListNode n1_2 = new ListNode(9);
        ListNode n2_2 = new ListNode(9);
        ListNode n3_2 = new ListNode(9);
        ListNode n4_2 = new ListNode(9);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);

        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);
        n3_2.setNext(n4_2);


        Solution2 slt = new Solution2();
        ListNode res = slt.addTwoNumbers(n1, n1_2);
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
