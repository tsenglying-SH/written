/*反转链表，并且返回链表的第一个节点*/
public class Q206 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode reverseList(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode pre= null;
        ListNode next= null;
        while(head!=null){
            next= head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(4);
        A.next=B;
        B.next=C;
        C.next=D;
        ListNode listNode = reverseList(A);
        System.out.println(listNode.val);
    }
}
