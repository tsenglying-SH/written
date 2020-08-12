/*给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。*/

import java.util.HashSet;
import java.util.Set;

public class Q55 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode EntryNodeOfLoop(ListNode pHead){
        Set<ListNode> hashSet=new HashSet<>();
        while(pHead!=null) {
            if (hashSet.contains(pHead)) {
                return pHead;
            } else {
                hashSet.add(pHead);
                pHead = pHead.next;
            }
        }
        return null;
    }

}
