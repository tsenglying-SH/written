/*反转链表,输出新表的表头*/
public class Q15 {
    public static class ListNode{
         int value;
         ListNode next=null;

         ListNode(int val){
            this.value=val;
        }
    }

    public static ListNode reverseListNode(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode pre = null;
        ListNode next= null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode A=new ListNode(1);
        ListNode B=new ListNode(2);
        ListNode C=new ListNode(3);
        ListNode D=new ListNode(4);
        A.next=B;
        B.next=C;
        C.next=D;
        ListNode listNode = reverseListNode(A);
        System.out.println(listNode.value);
    }

}
