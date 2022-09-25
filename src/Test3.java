/**
 * @version 1.0
 * @auther pjt
 */
public class Test3 {
    public static void main(String[] args) {

    }
}

class Solutio3 {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] n = new int[nums.length];
        int index = nums.length - 1;
        while (l <= r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                n[index] = nums[l] * nums[l];
                index--;
                l++;
            }else {
                n[index--] = nums[r] * nums[r];//有细节
                r--;
            }
        }
        return n;
    }
}