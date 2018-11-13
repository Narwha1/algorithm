package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test4 {
    /**
     * 18位身份证的编码规则是：
     * 前1、2位数字表示：所在省（直辖市、自治区）的代码
     * 第3、4位数字表示：所在地级市（自治州）的代码
     * 第5、6位数字表示：所在区（县、自治县、县级市）的代码；
     * 第7—14位数字表示：出生年、月、日；
     * 第17位数字表示性别：奇数表示男性，偶数表示女性；
     * 第18位数字是校检码，用来检验身份证的正确性。
     * 用户在输入身份证的过程中经常会输入错误，为了方便用户正确输入
     * 需要在输入过程中对用户的输入按照 6+8+4 的格式进行分组，
     * 实现一个方法接收输入过程中的身份证号，返回分组后的字符
     */

    public static void main(String[] args) throws IOException {
        Identerty1();
        System.out.println();
        Identerty2();
    }

    /**
     * 方法一
     *
     * 在第六位和第十四位输出空格
     */
    public static void Identerty1() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(" ", "");
        int len = str.length();
        for (int i = 0; i < len; ) {
            System.out.print(str.charAt(i));
            i++;
            if (i == 6 || i == 14) {
                System.out.print(" ");
            }
        }
    }

    /**
     * 方法二
     *
     * 同理
     */
    public static void Identerty2() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String str = buff.readLine();
        int first, second;
        first = 6;
        second = 14;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (first == 0 || second == 0) {
                System.out.print(" ");
            }
            System.out.print(str.charAt(i));
            first--;
            second--;
        }
        System.out.println("");
        buff.close();
    }
}
