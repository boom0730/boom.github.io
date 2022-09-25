/**
 * @version 1.0
 * @auther pjt
 * @question 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * @address
 * @date 2022年09月25日 09:56:27
 */
public class RansomLetter383 {
    public static void main(String[] args) {
        String rasomNote = "aa";
        String magazine = "aba";
        System.out.println(new Solution383().canConstruct(rasomNote,magazine));
    }
}
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length())
            return false;
        int n1 = ransomNote.length();
        int n2 = magazine.length();
        int cnt[] = new int[26];
        for (int i = 0; i < n1; i++) {
            cnt[ransomNote.charAt(i) - 'a']++;
        }
        //使用增强for循环,内存占用会少很多，引用类型以后都用增强for
        for (char c:magazine.toCharArray()) {
            cnt[c - 'a']--;
        }
//        for (int i = 0; i < n2; i++) {
//            cnt[magazine.charAt(i)-'a']--;
//        }
        for (int i = 0; i < 26; i++) {
            if (cnt[i]>0)
                return false;
        }
        return true;
    }
}