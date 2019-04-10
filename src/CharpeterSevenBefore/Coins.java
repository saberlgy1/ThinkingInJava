package CharpeterSevenBefore;

import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-21 09:13
 **/

public class Coins {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        if (coin % 2 == 0) System.out.println("head");
        else System.out.println("tails");

        int i = -1;
        i>>>=10;
        System.out.println(Integer.toBinaryString(i));
    }
}
