package com.algorithm.question;

import java.util.Scanner;

/**
 * 有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。
 * 请设计一个算法，计算小团有多少种走法。
 * 给定两个正整数int x,int y，请返回小团的走法数目。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = dd(n, m);
        System.out.println(q);
    }

    public static int dd(int n, int m) {
        if (n == 0 || m == 0) {
            return 1;
        } else {
            return dd(n - 1, m) + dd(n, m - 1);
        }
    }


}

