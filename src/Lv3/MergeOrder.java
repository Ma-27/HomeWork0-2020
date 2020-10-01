package Lv3;

public class MergeOrder {
    int[][] ZZjj, TQjj;
    int size;
    int[][] All;

    MergeOrder(int[][] ZZjj, int[][] TQjj) {
        this.ZZjj = ZZjj;
        this.TQjj = TQjj;
        //zzjj【I】长度为2
        size = ZZjj.length + TQjj.length;
        All = new int[size][2];
    }

    /**
     * 这个函数用来合并数组
     *
     * @return
     */
    int[][] Merge() {
        for (int i = 0; i < size; i++) {
            //如果是zzjj的，进入第一个循环
            if (i < ZZjj.length) {
                for (int j = 0; j < ZZjj[i].length; j++) {
                    All[i][j] = ZZjj[i][j];
                    //System.out.println(All[i][j]);
                }
                //System.out.println("结束一个内循环" + i);
                //结束一个循环
            } else if (i >= TQjj.length) {
                //如果是TQjj的，就循环这个

                for (int j = 0; j < TQjj[i- 8].length; j++) {
                    All[i][j] = TQjj[i - 8][j];
                    //System.out.println(All[i][j]);
                }
                //System.out.println("结束一个内循环" + i);
            } else {
                System.out.println("程序出错");
            }
            //第一个for循环结束
        }

        return All;
    }


}
