/**
 * @version 1.0
 * @auther pjt
 * @question    给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * @address
 * @date 2022年09月25日 09:38:58
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 */
public class ArrayDynamicSummation1480 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        Solution1480 solution1480 = new Solution1480();
        int[] result = solution1480.runningSum(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
class Solution1480 {
    public int[] runningSum(int[] nums) {
        //方法二：原地修改
        int n = nums.length;
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;

//        int[] result=new int[nums.length];
//        int res = 0;
//        for (int i = 0; i < nums.length; i++) {
//            res+=nums[i];
//            result[i]=res;
//        }
//        return  result;
    }
}