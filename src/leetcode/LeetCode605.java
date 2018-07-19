package leetcode;

/**
 * @Author ROKG
 * @Descriptio 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。
 * 可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。
 * 能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
 * @Date: Created in 下午11:58 2018/7/11
 * @Modified By:
 */
public class LeetCode605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length==0){
            return false;
        }else if (flowerbed.length==1){
            return (flowerbed[0]==0&&n<=1)||(flowerbed[0]==1&&n==0);
        }
        int count=0;
        for (int i=0;i<flowerbed.length;i++){
            if (flowerbed[i] == 0) {
                if (i == 0 ) {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i]=1;
                        count++;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i-1] == 0){
                        flowerbed[i]=1;
                        count++;
                    }
                } else if (flowerbed[i-1] ==0 && flowerbed[i+1] == 0){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        return count>=n;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,0,1},2));
    }
}
