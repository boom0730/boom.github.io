/**
 * @version 1.0
 * @auther pjt
 * @question 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 * 链接：https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @address https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/?plan=algorithms&plan_progress=gfcjvws
 * @date 2022年09月02日 14:13:36
 */
public class leetcode167 {
    public static void main(String[] args) {
        int[] nums = {0,0,3,4};
        int target = 0;
        int[] arr=new Solution167().twoSum(nums,target);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
//方法二 二分查找 因为是有序的数组
class Solution167{
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int l = i;int r = numbers.length - 1;
            while (l < r){
                int mid = l + (r - l)/2;
                if (numbers[mid] + numbers[l]== target){
                    return new int[]{l+1,mid+1};
                } else if (numbers[mid] + numbers[l]> target) {
                    r = mid -1;
                }else {
                    l = mid + 1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}

//class Solution167 {
//    public int[] twoSum(int[] numbers, int target) {
//        int l = 0;
//        int[] arr = new int[2];
//        while (l < numbers.length){
//            for (int r = l + 1; r < numbers.length; r++) {//这种做法l的初始值小心
//                if(numbers[l] + numbers[r] == target){
//                    arr[0] = l + 1;
//                    arr[1] = r + 1;
//                    return arr;
//                }
//            }
//            l++;
//        }
//        arr[0] = 0;
//        arr[1] = 0;
//        return arr;
//    }
//}