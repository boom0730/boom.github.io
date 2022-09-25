import java.util.Arrays;

/**
 * @version 1.0
 * @auther pjt
 * @question
 * @address
 * @date 2022年09月09日 11:52:27
 */
public class isSubString567 {
    public static void main(String[] args) {
        Solution567 solution567 = new Solution567();
        System.out.println(solution567.checkInclusion("ab","eidbaooo"));
    }
}

class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(),m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            cnt[s1.charAt(i) - 'a']--;
        }//统计s1的词频表，看作赊账表，后头滑动窗口s2时还账，全为0的时候就相等了
        int l =0,r = 0;
        //开始进行滑动窗口，r往右移一位，每次都判断cnt[s2.charAt(r)-'a']是否不符合
        //如果不符合条件就将l左移，直到r右移带来的不符合条件的抵消为止
        while (r<m){
            cnt[s2.charAt(r)-'a']++;
            while (cnt[s2.charAt(r) - 'a']>0){
                cnt[s2.charAt(l) - 'a']--;
                l++;
            }
            r++;
            if (r - l == n){
                return true;
            }

            //
        }
        return false;
    }
}
//class Solution567 {
//    public boolean checkInclusion(String s1, String s2) {
//        int n = s1.length(),m = s2.length();
//        int[] cnt1 = new int[26];
//        int[] cnt2 = new int[26];
//        if (n > m){
//            return false;
//        }
//        for (int i = 0; i < n; i++) {
//            cnt1[s1.charAt(i) - 'a']++;
//            cnt2[s2.charAt(i) - 'a']++;
//        }
//  //      if (cnt1.equals(cnt2))这样不对看equals的源码
//        if (Arrays.equals(cnt1,cnt2)){
//            return true;
//        }
//        for (int i = n; i < m; i++) {
//            cnt2[s2.charAt(i)-'a']++;
//            cnt2[s2.charAt(i - n )-'a']--;
//            if (Arrays.equals(cnt1,cnt2)){
//                return true;
//            }
//        }
//        return false;
//    }
//}