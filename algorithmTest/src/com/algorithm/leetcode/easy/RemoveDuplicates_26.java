package com.algorithm.leetcode.easy;

/**
 * algorithm
 *
 * @author zhangjingyi 2021-03-04 15:51:12
 */
public class RemoveDuplicates_26 {
    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * <p>
     * 示例1:
     * <p>
     * 给定数组 nums = [1,1,2],
     * <p>
     * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
     * <p>
     * 你不需要考虑数组中超出新长度后面的元素。
     * <p>
     * <p>
     * 示例2:
     * <p>
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     * <p>
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     * <p>
     * 你不需要考虑数组中超出新长度后面的元素。
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 4, 5};
        System.out.println(removeDuplicates(nums));
    }
}
