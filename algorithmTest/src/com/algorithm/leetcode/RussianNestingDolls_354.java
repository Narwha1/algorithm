package com.algorithm.leetcode;

import java.util.Arrays;

/**
 * algorithm
 *
 * @author zhangjingyi 2021-03-04 13:33:29
 */
public class RussianNestingDolls_354 {
    /**
     * 给定一些标记了宽度和高度的信封，宽度和高度以整数对形式(w, h)出现。当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
     * <p>
     * 请计算最多能有多少个信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
     * <p>
     * 说明:
     * 不允许旋转信封。
     * <p>
     * 示例:
     * <p>
     * 输入: envelopes = [[5,4],[6,4],[6,7],[2,3]]<br>
     * 输出: 3<br>
     * 解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
     */
    public static int maxEnvelopes(int[][] envelopes) {
        for (int[] envelope : envelopes) {
            System.out.println(Arrays.toString(envelope));
        }
        return 1;
    }

}
