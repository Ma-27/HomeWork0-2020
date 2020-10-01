package Lv3;

public class Sort {
    int[][] allOrders,resultOrders;
    int temp1,temp2;

    Sort(int[][] allOrders) {
        this.allOrders = allOrders;
    }

    int[][] SortPrice(){
        for(int i = 0;i < allOrders.length - 1;i++){

            for(int j = i + 1;j < allOrders.length;j++){
                if (allOrders[i][0] >= allOrders[j][0]) {

                      temp1 = allOrders[j][0];
                      allOrders[j][0] = allOrders[i][0];
                      allOrders[i][0] = temp1;

                      //价格交换
                      temp2 = allOrders[j][1];
                      allOrders[j][1] = allOrders[i][1];
                      allOrders[i][1] = temp2;
                  }
            }
        }
        return allOrders;
    }



    /**
     *
     */
}
