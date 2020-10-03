package Lv4;

public class Calculator {
    int R, y;
    double x;
    short[][] data;

    Calculator(int R) {
        this.R = R;
        data = new short[R][R];
    }

    /**
     * 计算用图像表示的圆形
     * m是行遍历变量，从24遍历到0，共25行，和y类似
     * y是图形中真实的y值，x是计算得来的真实的x值
     * n是列遍历变量，从0遍历到24，从左到右。和x类似
     */
    short[][] CalculateCircle() {
        for (int m = R - 1; m >= 0; m--) {
            y = m + 1;
            x = Math.sqrt(((R * R) - (y * y)));

            for (int n = 0; n < R; n++) {
                //Math.round四舍五入
                if (n == Math.round((int) x)) {
                    data[m][n] = 1;
                }
                //System.out.print(String.valueOf(data[m][n]));
            }
            //System.out.println();
        }

        return data;
    }

}
