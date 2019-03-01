import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @Author: liuzhengliang
 * @Date: 2019-03-01 14:51
 */
public class At0003 {
    /**
     * 无重复字符长度
     *
     * @param s 字符串
     * @return 长度
     */
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        //前后同时截取
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                final String substring = s.substring(i, j);
                if (judgingTimes(substring) && (substring.length() > maxLength)) {
                    maxLength = substring.length();
                }
            }

        }
        return maxLength;
    }

    /**
     * 判断是否为无重复字符
     *
     * @param s 字符串
     * @return 是否
     */
    public boolean judgingTimes(String s) {
        //取得abcabcbb
        int judgingSum = 0;
        for (int j = 0; j < s.length(); j++) {
            //拿到a
            final char c = s.charAt(j);
            //和a后面每个元素进行比对
            for (int k = j + 1; k < s.length(); k++) {
                //字符重复次数
                if (s.charAt(k) == c) {
                    ++judgingSum;
                }
                if (judgingSum == 1) {
                    break;
                }
            }
            if (judgingSum == 1) {
                break;
            }
        }
        if (judgingSum == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*****************************标准答案***************************************/
    //这方法真牛逼！！！！
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                //上一次无重复位数
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    /*****************************标准答案***************************************/


    public static void main(String[] args) {
        At0003 at0003 = new At0003();
        int abcabcbb = at0003.lengthOfLongestSubstring2("pwwkefw");
        System.out.println(abcabcbb);
    }
}
