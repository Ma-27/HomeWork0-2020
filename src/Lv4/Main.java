package Lv4;

public class Main {
    public static void main(String[] args) {
        //可以控制打印圆的半径,在这里修改
        final int r = 10;
        short[][] data;

        //计算一个1/4圆形，将其转换为r*r的数组
        Calculator calculator = new Calculator(r);
        data = calculator.calculateCircle();

        //计算出全部数组并且输出
        Drawer drawer = new Drawer(r, data);
        drawer.drawFunction();
    }
}
