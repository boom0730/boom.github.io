/**
 * @version 1.0
 * @auther pjt
 * @question 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，
 * 同时仍保留空格和单词的初始顺序。
 * @address https://leetcode.cn/problems/reverse-words-in-a-string-iii/?plan=algorithms&plan_progress=gfcjvws
 * @date 2022年09月03日 09:13:52
 */
public class leetcode557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        new Solution557().reverseWords(s);
    }
}
//只能开辟新的字符串
//StringBuffer类的对象是可以被修改的
class Solution557{
    public String reverseWords(String s) {
        StringBuffer ret = new StringBuffer();
        int i = 0;
        while (i < s.length()){
            int start = i;
            while (i<s.length()&&s.charAt(i) != ' '){
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(i - 1 + start -p));//等差数列哈哈
            }
            while (i<s.length()&&s.charAt(i) == ' '){
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }
}
//class Solution557 {
//    public String reverseWords(String s) {
//        int l = 0;int r = 0;
//        while (r < s.length()){
//            while (s.charAt(r) != ' '){
//                r++;
//            }
//            for (int i = l; i <= r; i++) {
//                char temp = s.charAt(l);
//                s.charAt()
//            }
//        }
//    }
//}我这个想法不行因为java的字符串不能改变了