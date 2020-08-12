import java.util.ArrayList;
import java.util.Stack;

/*从尾到头打印链表*/
public class Q3 {
    public static  class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (listNode == null) return arr;
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arr.add(stack.pop());
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode A=new ListNode(1);
        ListNode B=new ListNode(2);
        ListNode C=new ListNode(3);
        ListNode D=new ListNode(4);
        A.next=B;
        B.next=C;
        C.next=D;
        ArrayList<Integer> list = printListFromTailToHead(A);
        System.out.println(list);
    }
}
