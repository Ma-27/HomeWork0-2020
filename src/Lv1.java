import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        int time;
        System.out.println("输入一个时间：");
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();
        if (time <= 0 || time >= 24) {
            System.out.println("你输入的时间出错了，再试一次吧");
        } else if (time <= 7 || time >= 18) {
            System.out.println("张涛姐姐应该回复学妹了");
        } else {
            System.out.println("张涛姐姐应该回复学弟了");
        }
    }
}
