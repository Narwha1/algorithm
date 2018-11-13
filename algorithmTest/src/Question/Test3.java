package Question;

import java.util.Scanner;

public class Test3 {
    /**
     * 有一片1000*1000的草地，小易初始站在(1,1)(最左上角的位置)。
     * 小易在每一秒会横向或者纵向移动到相邻的草地上吃草(小易不会走出边界)。
     * 大反派超超想去捕捉可爱的小易，他手里有n个陷阱。第i个陷阱被安置在横坐标为xi，
     * 纵坐标为yi的位置上，小易一旦走入一个陷阱，将会被超超捕捉。你为了去解救小易，
     * 需要知道小易最少多少秒可能会走入一个陷阱，从而提前解救小易。
     */
    public static void main(String[] args) {

        int n;
        int[] a = new int[1000];
        int[] b = new int[1000];

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            b[i] = in.nextInt();
        }

        int dis = 2000;
        for (int i = 0; i <= n - 1; i++) {
            if (dis > a[i] + b[i]) {
                dis = a[i] + b[i];
            }
        }

        System.out.println(dis - 2);
    }
}