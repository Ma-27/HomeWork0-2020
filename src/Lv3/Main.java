package Lv3;

public class Main {
    public static void main(String[] args) {
        int[][] ZZjj,TQjj,AllOrders,FormedOrders;
        //哲哲姐姐的奶茶订单如下(第一个数字表示订单号，第二个数字表示奶茶价格)
        ZZjj = new int[][]
                {{24, 8}, {35, 9}, {15, 10}, {17, 8}, {20, 7}, {49, 14}, {50, 16}, {98, 16}};

        //天齐姐姐的奶茶订单如下
        TQjj = new int[][]
                {{3, 8}, {5, 9}, {2, 17}, {45, 8}, {13, 7}, {99, 14}, {175, 16}, {151, 99999}};

        MergeOrder mergeOrder = new MergeOrder(ZZjj,TQjj);
        AllOrders = mergeOrder.Merge();
        //打印合并后的数据
        //printOrder(AllOrders);

        Sort sort = new Sort(AllOrders);
        FormedOrders = sort.SortPrice();
        printOrder(FormedOrders);
    }

    static void printOrder(int[][] Orders){
        System.out.println("打印"+Orders);

        for(int i = 0;i < Orders.length;i++){
            for(int j = 0;j < Orders[i].length;j++){
                System.out.printf(String.valueOf(Orders[i][j]));

                //输出要求的格式
                if(j == 0){
                    System.out.printf(",");
                }

            }
            System.out.println();
        }
    }
}
