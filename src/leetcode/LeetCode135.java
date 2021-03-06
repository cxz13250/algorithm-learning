package leetcode;

import java.util.Arrays;

/**
 * @Author ROKG
 * @Description 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。
 * 相邻的孩子中，评分高的孩子必须获得更多的糖果。
 * 那么这样下来，老师至少需要准备多少颗糖果呢？
 * @Date: Created in 2018/8/17
 * @Modified By:
 */
public class LeetCode135 {

    public static int candy(int[] ratings) {
        if (ratings.length==1){
            return 1;
        }
        int[] res=new int[ratings.length];
        Arrays.fill(res, 1);
        int sum=0;
        for (int i=0;i<ratings.length;i++){
            if (i==0) {
                if (ratings[i] > ratings[i + 1]) {
                    res[i]++;
                }
            }else if (i==ratings.length-1){
                if (ratings[i] > ratings[i-1]){
                    res[i]=res[i-1]+1;
                }
            }else {
                if (ratings[i] > ratings[i-1]){
                    res[i]=res[i-1]+1;
                }
                if (ratings[i] > ratings[i+1]){
                    if (res[i] < res[i+1]){
                        res[i] = res[i+1]+1;
                    }else if (res[i]==res[i+1]){
                        res[i]++;
                    }
                    int j=i-1;
                    while (j>=0&&ratings[j]>ratings[j+1]&&res[j]<=res[j+1]){
                        res[j]=res[j+1]+1;
                        j--;
                    }
                }
            }
        }
        for (int i:res){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,6,10,8,7,3,2}));
    }
}
