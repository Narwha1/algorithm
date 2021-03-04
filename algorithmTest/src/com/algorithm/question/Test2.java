package com.algorithm.question;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    /**
     * 给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。
     * 输入值小于1000。
     * 如，输入为10, 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(findPrimeNumberPair1(i));
    }

    /**
     * 方法一
     * 找出所有素数，存到ArrayList中
     * 然后头尾指针寻找正确的值
     *
     * @param sum
     * @return
     */
    private static int findPrimeNumberPair(int sum) {
        if (sum <= 3) {
            return 0;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int num = 0;
        for (int i = 2; i < 1000; i++) {
            if (isPrimeNum(i)) {
                arrayList.add(i);
            }
        }
        int minIndex = 0;
        int maxIndex = arrayList.size() - 1;
        while (minIndex <= maxIndex) {
            if (arrayList.get(minIndex) + arrayList.get(maxIndex) > sum) {
                maxIndex--;
            } else if (arrayList.get(minIndex) + arrayList.get(maxIndex) < sum) {
                minIndex++;
            } else {
                num++;
                minIndex++;
            }
        }
        return num;
    }

    /**
     * 方法二
     * 通过sum，确定质数存在范围；
     * 然后边找质数边做，时间复杂度提高，空间复杂度降低；
     *
     * @param sum
     * @return
     */
    public static int findPrimeNumberPair1(int sum) {
        if (sum <= 3) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i <= sum / 2; i++) {
            for (int j = 2; j < sum - i + 1; j++) {
                if (isPrimeNum(i) && isPrimeNum(j) && (i + j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 判断一个数是否是质数
     *
     * @param i
     * @return
     */
    private static boolean isPrimeNum(int i) {
        for (double j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }


}
