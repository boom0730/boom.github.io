/**
 * @version 1.0
 * @auther pjt
 * @question 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * @address https://leetcode.cn/problems/rotate-array/?plan=algorithms&plan_progress=gfcjvws
 * @date 2022年09月02日 09:42:53
 * @packageName PACKAGE_NAME
 */
public class leetcode189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Solution189 solution189 = new Solution189();
        solution189.rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
//双指针的数组反转
//数组向后依次轮转k个位置可以先反转数组再按k分开两边同时反转
class Solution189{
    public void rotate(int[] nums, int k) {
        k %= nums.length;//千万小心不要搞忘
        viewrotate(nums,0, nums.length-1);
        viewrotate(nums,0,k-1);
        viewrotate(nums,k, nums.length-1);
    }
    public void viewrotate(int[] nums,int l,int r){
        int flag = 0;
        while (l < r){
            flag = nums[l];
            nums[l] = nums[r];
            nums[r--] = flag;
            l++;
        }
    }

}
//class Solution189 {
//    public void rotate(int[] nums, int k) {
//       int[] copyarr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            copyarr[(i + k) % nums.length] = nums[i];//相当于环状了那天的栈也有这个
//        }
//        System.arraycopy(copyarr,0,nums,0,nums.length);//新方法copy数组
//    }
//}