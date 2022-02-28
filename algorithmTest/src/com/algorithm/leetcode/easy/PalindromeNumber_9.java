package com.algorithm.leetcode.easy;

/**
 * 回文数
 *
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 * 示例 1：
 *
 * 输入：x = 121
 * 输出：true
 * 示例 2：
 *
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3：
 *
 * 输入：x = 10
 * 输出：false
 * 解释：从右向左读, 为 01 。因此它不是一个回文数。
 */
public class PalindromeNumber_9 {

    public static boolean isPalindrome(int x) {
        String num = x + "";
        String num2 = new StringBuilder(x + "").reverse().toString();
        return num2.equals(num);
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(12321));
    }

    /*
    cur   num
    0     12321
    1     1232
    12    123
    123   12
    1232  1
    12321 0
     */
}
