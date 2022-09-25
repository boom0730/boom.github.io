/**
 * @version 1.0
 * @auther pjt
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(solution.search(nums,target));
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid = (l+r)/2;
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }//这个没考虑到
        while (l<=r){
            mid = (l + r)/2;
            if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
//class Solution {
//    public int search(int[] nums, int target) {
//        int left = 0, right = nums.length;
//        while (left < right) {
//            int mid = left + ((right - left) >> 1);
//            if (nums[mid] == target)
//                return mid;
//            else if (nums[mid] < target)
//                left = mid + 1;
//            else if (nums[mid] > target)
//                right = mid;
//        }
//        return -1;
//    }
//}  这种为什么不用考虑边界？