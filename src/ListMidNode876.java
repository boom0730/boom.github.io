/**
 * @version 1.0
 * @auther pjt
 * @question 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * @address
 * @date 2022年09月09日 09:43:21
 */
public class ListMidNode876 {
    public static void main(String[] args) {

    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//单指针法
//class Solution876 {
//    public ListNode middleNode(ListNode head) {
//        int n = 0;
//        ListNode l = head;
//        while (l!=null){
//            n++;
//            l = l.next;
//        }
//        l = head;
//        for (int k = 0;k < n/2;k++){
/**
 * 为什么不加一
 * 因为k=0的时候指针在第一个Node上此时执行l=l.next则指针指向第二个了
 * 再for
 * 画图看
 */

//            l = l.next;
//        }
//        return l;
//    }
//}

//快慢指针法
class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode low = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            /**
            好好思考一下 2为一个周期
             */
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }
}