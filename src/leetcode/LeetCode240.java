package leetcode;

/**
 * @Author ROKG
 * @Description 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * @Date: Created in 上午10:34 2018/6/18
 * @Modified By:
 */
public class LeetCode240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0) {
            return false;
        }
        int i=0,j=matrix[0].length-1;
        while (i<matrix.length&&j>=0){
            int temp=matrix[i][j];
            if (temp<target){
                i++;
            }else if (temp>target){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[][] nums={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        LeetCode240 l=new LeetCode240();
        System.out.println(l.searchMatrix(nums,20));
    }
}
