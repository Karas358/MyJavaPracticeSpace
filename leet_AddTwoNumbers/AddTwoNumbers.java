package leet_AddTwoNumbers;
import java.util.LinkedList;

public class AddTwoNumbers {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }

    public class LinkedList{
        //ListNode head 
    }

    public ListNode addNumbers(ListNode l1, ListNode l2){
        int val1 = 0;
        int val2 = 0;
        while(l1.next != null){
            val1 += l1.val;
        }
        val1 += l1.val;
        while(l2.next != null){
            val2 += l2.val;
        }
        val2 += l2.val;
        String sum = (val1 + val2) + "";
        char[] s = sum.toCharArray();
        for (char c : s) {
            //l2.
        }

        return l2;
    }
}
