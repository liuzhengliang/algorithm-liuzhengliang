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
        for (int i = 0; i < s.length(); i++) {
            final String substring = s.substring(i);

        }
        return 1;
    }

    /**
     * 判断是否为无重复字符
     *
     * @param s 字符串
     * @return 是否
     */
    public boolean judgingimesT(String s) {
        //字符重复次数
        int judgingSum = 0;
        for (int j = 0; j < s.length(); j++) {
            final char c = s.charAt(j);
            if (s.contains(String.valueOf(c))) {

            }
        }
        return true;
    }

    public static void main(String[] args) {
        At0003 at0003 = new At0003();
        int abcabcbb = at0003.lengthOfLongestSubstring("abcabcbb");
        System.out.println("abcabcbb".length());
    }
}
