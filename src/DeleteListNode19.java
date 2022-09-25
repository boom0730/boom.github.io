/**
 * @version 1.0
 * @auther pjt
 * @question
 * @address
 * @date 2022年09月09日 10:19:24
 */
public class DeleteListNode19 {

}
//快慢指针法
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode low = dummy;
        /**
         * 对链表的操作经常会用到这个dummy哑节点的思路
         */
        ListNode fast = head;
        for (int i = 0;i < n;i++){
            fast = fast.next;
        }
        while (fast!=null){
            low = low.next;
            fast = fast.next;
        }
        low.next = low.next.next;
        return dummy.next;
        /**
         * 不能return  head别犯傻
         */
    }
}
