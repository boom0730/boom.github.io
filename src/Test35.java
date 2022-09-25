/**
 * @version 1.0
 * @auther pjt
 * @question给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class Test35 {
}
class Solution35{
    public int searchInsert(int[] nums,int target){
        int l = 0;
        int r = nums.length - 1;
        int mid = l + (r - l)>>1;
        while (l <= r){
            mid = l + (r - l)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[mid] < target){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return l;
    }
}
