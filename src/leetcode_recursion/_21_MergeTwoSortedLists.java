/*
*  | mergeTwoLists(22,null) |  ---> return list1(22->40)
*  | mergeTwoLists(22,20)   |  ---> return list2(20->22->40)
*  | mergeTwoLists(22,16)   |  ---> return list2(16->20->22->40)
*  | mergeTwoLists(22,11)   |  ---> return list2(11->16->20->22->40)
*  | mergeTwoLists(8,11)    |  ---> return list1(8->11->16->20->22->40)
*  | mergeTwoLists(8,4)     |  ---> return list2(4->8->11->16->20->22->40)
*  | mergeTwoLists(1,4)     |  ---> return list1(1->4->8->11->16->20>22->40)
*
* */


package leetcode_recursion;

import fcc_code_example_recursion.ListNode;

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // base case
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

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



