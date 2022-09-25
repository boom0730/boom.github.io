/**
 * @version 1.0
 * @auther pjt
 */
public class Test2 {
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        Solution1 solution = new Solution1();
        int n = solution.removeElement(nums,val);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }
    }
}
class Solution1 {
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        for (; fast < nums.length ; fast++) {
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}