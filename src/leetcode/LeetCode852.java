package leetcode;

/**
 * @Author ROKG
 * @Description 我们把符合下列属性的数组 A 称作山脉：
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 * @Date: Created in 2018/7/17
 * @Modified By:
 */
public class LeetCode852 {

    public int peakIndexInMountainArray(int[] A) {
        for (int i=0;i<A.length;i++) {
            if (A[i]>A[i+1]){
                return i;
            }
        }
        return -1;
    }
}
