package leetcode;

import com.sun.deploy.util.StringUtils;

/**
 * @Author ROKG
 * @Description 给定一个密钥字符串S，只包含字母，数字以及 '-'（破折号）。N 个 '-' 将字符串分成了 N+1 组。
 * 给定一个数字 K，重新格式化字符串，除了第一个分组以外，每个分组要包含 K 个字符，第一个分组至少要包含 1 个字符。
 * 两个分组之间用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
 * 给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
 * @Date: Created in 2018/7/27
 * @Modified By:
 */
public class LeetCode482 {

    public String licenseKeyFormatting(String S, int K) {
        S=S.toUpperCase();
        StringBuilder sb=new StringBuilder();
        int countA=0;
        for (int i=0;i<S.length();i++){
            if (S.charAt(i)!='-'){
                countA++;
            }
        }
        int headLen=countA%K==0?K:countA%K;
        int count=0;
        int i;
        for (i=0;i<S.length();i++){
            if (count==headLen){
                break;
            }
            if (S.charAt(i)!='-') {
                sb.append(S.charAt(i));
                count++;
            }
        }
        sb.append('-');
        count=0;
        for (int j=i;j<S.length();j++){
            if (S.charAt(j)=='-'){
                continue;
            }
            sb.append(S.charAt(j));
            count++;
            if (count==K){
                sb.append('-');
                count=0;
            }
        }
        if (sb.charAt(sb.length()-1)=='-'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
