package Lv4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int r = 25;
        short[][] data;

        Calculator calculator = new Calculator(r);
        data  = calculator.CalculateCircle();

        Drawer drawer = new Drawer(r,data);
        drawer.DrawFunction();
    }
}
