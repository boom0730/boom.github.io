import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @auther pjt
 * @question
 * @address
 * @date 2022年09月25日 10:19:31
 */
public class FizzBuzz412 {
    public static void main(String[] args) {

    }
}
class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%15==0){
                list.add("FizzBuzz");
            }else if (i%5==0&&i%15!=0){
                list.add("Buzz");
            } else if (i%3==0) {
                list.add("Fizz");
            }else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}