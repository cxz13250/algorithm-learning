package leetcode;

/**
 * @Author ROKG
 * @Description
 * @Date: Created in 下午12:35 2018/4/19
 * @Modified By:
 */
public class LeetCode405 {

    public static String toHex(int num) {
        String result="";
        int temp=0;
        int i=0;
        while(i<8){
            temp=num&15;
            result=changeToChar(temp)+result;
            num = num >> 4;
            if(num==0){
                break;
            }
            i++;
        }
        return result;
    }

    public static char changeToChar(int num){
        if(num<10){
            return (char)(num+'0');
        }else{
            return (char)(num-10+'a');
        }
    }

    public static void main(String[] args) {
        System.out.println(toHex(26));
        System.out.println(toHex(-1));

    }
}
