package Lv4;

public class Main {
    public static void main(String[] args) {
        //可以控制打印圆的半径
        final int r = 12;
        short[][] data;

        Calculator calculator = new Calculator(r);
        data = calculator.CalculateCircle();

        Drawer drawer = new Drawer(r, data);
        drawer.DrawFunction();
    }
}
