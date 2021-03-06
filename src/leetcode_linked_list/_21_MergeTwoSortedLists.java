package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode pre = new ListNode(-1);
        ListNode head = pre;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        head.next = list1 == null ? list2 : list1;

        return pre.next;

    }
}

// Time complexity: O(m+n)
// Space complexity: O(1)
public class _21_MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(22);
        ListNode n4 = new ListNode(40);

        ListNode n1_2 = new ListNode(4);
        ListNode n2_2 = new ListNode(11);
        ListNode n3_2 = new ListNode(16);
        ListNode n4_2 = new ListNode(20);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);
        n3_2.setNext(n4_2);

        Solution21 slt = new Solution21();
        ListNode res = slt.mergeTwoLists(n1, n1_2);
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
