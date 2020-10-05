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
     * @return 合并后的全部数组
     */
    int[][] merge() {
        for (int i = 0; i < size; i++) {
            //如果是zzjj的，进入第一个循环
            if (i < ZZjj.length) {
                //System.out.println(All[i][j]);
                System.arraycopy(ZZjj[i], 0, All[i], 0, ZZjj[i].length);
                //System.out.println("结束一个内循环" + i);
                //结束一个循环
            } else if (i >= TQjj.length) {
                //如果是TQjj的，就循环这个

                //System.out.println(All[i][j]);
                System.arraycopy(TQjj[i - 8], 0, All[i], 0, TQjj[i - 8].length);
                //System.out.println("结束一个内循环" + i);
            } else {
                System.out.println("程序出错");
            }
            //第一个for循环结束
        }

        return All;
    }


}
