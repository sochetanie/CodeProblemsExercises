import java.util.*;

public class Fibonacci {
    private int[] fib = new int[200];

    public Fibonacci() {
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
    }

    public int returnN(int n){
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().returnN(30));
    }
}


public class DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead){
        if(pHead == null)   return null;
        if(pHead.next == null)  return pHead;
        if (pHead.val == pHead.next.val) {
            ListNode next = pHead.next;
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        }
        pHead.next = deleteDuplication(pHead.next);
        return pHead;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4_2 = new ListNode(4, l5);
        ListNode l4_1 = new ListNode(4, l4_2);
        ListNode l3_3 = new ListNode(3, l4_1);
        ListNode l3_1 = new ListNode(3, l3_3);
        ListNode l2 = new ListNode(2, l3_1);
        ListNode l1 = new ListNode(1, l2);

        ListNode.printList(deleteDuplication(l1));
    }
}


public class ReverseList {
    public static ArrayList<Integer> getTailNode(ListNode head){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        ListNode newList = new ListNode(-1, null);
        while(head != null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            arrList.add(0, newList.next.val);
            head = next;
        }
        return arrList;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        System.out.println(getTailNode(l1));
    }
}
About
