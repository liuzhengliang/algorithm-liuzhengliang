/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * @Author: liuzhengliang
 * @Date: 2019-03-02 20:27
 */
public class At0004 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //1，3，8，10
        //2，7，9，10，21
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int s1Poin = 0;
        int s2Poin = 0;
        int num[] = new int[nums1Length + nums2Length];
        //取1数组第一个元素和2数组第一个元素比对，哪个小插入哪个。如果插入的是1数组。则从 1-2和 2-1 比 以此类推
        do {
            int min = Math.min(nums1[s1Poin], nums2[s2Poin]);
            num[s1Poin + s2Poin] = min;
            if (min == nums1[s1Poin]) {
                ++s1Poin;
            } else {
                ++s2Poin;
            }
        } while (num.length == nums1Length + nums2Length);
        //判断是否整除
        int midNum = 0;
        if ((nums1Length + nums2Length) % 2 == 0) {
            midNum = num[(nums1Length + nums2Length) / 2];
        } else {
            int i = (nums1Length + nums2Length) / 2;
            midNum = (num[i] + num[i + 1]) / 2;
        }
        return midNum;
    }

}
