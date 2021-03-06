package leetcode;

/**
 * @Author ROKG
 * @Description 数组 A 包含 N 个数，且索引从0开始。数组 A 的一个子数组划分为数组 (P, Q)，P 与 Q 是整数且满足 0<=P<Q<N 。
 * 如果满足以下条件，则称子数组(P, Q)为等差数组：
 * 元素 A[P], A[p + 1], ..., A[Q - 1], A[Q] 是等差的。并且 P + 1 < Q 。
 * 函数要返回数组 A 中所有为等差数组的子数组个数。
 * @Date: Created in 下午3:06 2018/7/21
 * @Modified By: *
 */
public class LeetCode413 {

    public int numberOfArithmeticSlices(int[] A) {
        int flag=0;
        int count=0;
        for (int i=2;i<A.length;i++){
            if (A[i] - A[i-1] == A[i-1]-A[i-2]) {
                count += ++flag;
            }else {
                flag=0;
            }
        }
        return count;
    }

}
