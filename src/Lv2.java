public class Lv2 {
    public static void main(String[] args) {
        int number, digitsBit, hundredBit, decadeBit;
        System.out.println("所有水仙花数为：");
        //digitsBit 个位，hundredBit 百位，decadeBit 十位
        for (number = 100; number < 1000; number++) {
            //分离每个位上的数字
            digitsBit = number % 10;
            hundredBit = number / 100;
            decadeBit = (number - (100 * hundredBit) - digitsBit) / 10;

            int targetNum = digitsBit * digitsBit * digitsBit
                    + decadeBit * decadeBit * decadeBit + hundredBit * hundredBit * hundredBit;

            //判断筛选符合条件的数字
            if (targetNum == number) {
                System.out.println(number);
            }
        }
    }
}
