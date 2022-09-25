/**
 * @version 1.0
 * @auther pjt
 * @question 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 链接：https://leetcode.cn/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @address https://leetcode.cn/problems/reverse-string/?plan=algorithms&plan_progress=gfcjvws
 * @date 2022年09月03日 09:06:09
 */
public class leetcode344 {
    public static void main(String[] args) {
    }
}
class Solution344 {
    public void reverseString(char[] s) {
        int l = 0;int r = s.length - 1;
        while (l <= r){
            char flag = s[l];
            s[l] = s[r];
            s[r] = flag;
            l++;
            r--;
        }
    }
}