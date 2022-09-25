/**
 * @version 1.0
 * @auther pjt
 * @question 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
 * 同时保持非零元素的相对顺序。
 * @address https://leetcode.cn/problems/move-zeroes/?plan=algorithms&plan_progress=gfcjvws
 * @date 2022年09月02日 10:45:50
 */
public class leetcode283 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        new Solution283().moveZeroes(nums);
    }
}
//双指针法
class Solution283{
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        while (r < nums.length) {//r来充当寻0的指针
            if (nums[r] != 0){
                swap(nums,l,r);
                l++;
            }
            r++;
        }
    }//！！！思想是右指针一直去找非0数，
    // 仅当右指针指向非0数时交换左右指针的数，左右指针同时右移
    //这种算法可以保证左指针左边一定是非0
    //左指针到右指针全0
    //右指针右边是待找的
    public void swap(int[] nums,int l,int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
//class Solution283{
//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length;) {
//            if (nums[i] != 0){
//                i++;
//            }else {
//                for (int j = i + 1; j < nums.length; j++) {
//                    nums[j - 1] = nums[j];
//                }
//                nums[nums.length -1] = 0;
//            }
//        }
//    }
//}有问题，会卡死在00000