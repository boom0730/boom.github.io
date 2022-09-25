/**
 * @version 1.0
 * @auther pjt
 */
public class Test278 {
}
//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        int l = 1;
//        int r = n;
//        while (l < r){
//            int mid = (l + r)/2;//这种在数大的时候耗时很长使用l+(r-l)/2来代替
//            if (isBadVersion(mid)) {
//                r = mid;
//            }else {
//                l = mid + 1;//这里加1和上面不加1一定要搞清楚
//            }
//        }
//        return l;
//    }
//}