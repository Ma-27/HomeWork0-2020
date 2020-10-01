package Lv4;

class Drawer {
    int R,D;
    short[][] initialData, middleData,CompletedData;

    Drawer(int R,short[][] data){
        this.R = R;
        this.initialData = data;
        D = R*2;
    }

    void DrawFunction(){
        middleData = CalculateIntegralCircuit(initialData);
        DrawArray(middleData);
    }

    /**
     * 计算
     * @param initialData 传入的第一象限的圆形
     * @return 完整的圆形
     */
    short[][] CalculateIntegralCircuit(short[][] initialData){
        short[][] temp;
        int size = initialData.length*2;
        temp = new short[size][size];
        //遍历行，从上到下
        for(int i = size;i >= 0;i--){
            /*外循环分为上下两节，这个上面的1/2圆
            判断上面的半个圆循环完了没有，完了就循环下一个
             */
            if(i< initialData.length){
                //这个循环遍历一个行中的列元素，一个元素为单位,共2r个元素
                for (int j = 0 ;j < size;j++){
                    //将两个相加，判断是否加完了，再加上另一个
                    if(j < initialData.length){
                        temp[i][j] = initialData[i][(R-1)-j];
                    }else {
                        temp[i][j] = initialData[i][j-R];
                    }
                }
            }else {
                //遍历1/4圆形下面的部分
                for(int j = 0;j < size;j++){
                    //将两个相加，判断是否加完了，再加上另一个
                    if(j < initialData.length){
                        //temp[i][j] = initialData[i][(R-1)-j];
                    }else {
                        //temp[i][j] = initialData[i-25][j-R];
                    }
                }
            }
        }
        return temp;
    }

    /**
     * 将0 和1 数据转化成图形
     * @param data
     */
    private void DrawArray(short[][] data) {
        for (int m = data.length - 1; m >= 0; m--) {
            for (int n = 0; n < data.length; n++) {
                if(data[m][n]==1){
                    System.out.print("*");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
