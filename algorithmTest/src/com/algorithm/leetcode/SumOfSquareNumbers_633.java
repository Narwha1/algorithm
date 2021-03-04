package com.algorithm.leetcode;

public class SumOfSquareNumbers_633 {
    public static boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                return true;
            } else if (powSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 3;
        boolean a = judgeSquareSum(c);
        System.out.println(a);
    }
}
