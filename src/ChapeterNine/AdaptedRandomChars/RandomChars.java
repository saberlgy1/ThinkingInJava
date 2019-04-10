package ChapeterNine.AdaptedRandomChars;

import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 17:03
 **/

public class RandomChars {
    private static Random rand = new Random();
    public char next() {
        return (char)rand.nextInt(128);
    }
    public static void main(String[] args) {
        RandomChars rc = new RandomChars();
        for(int i = 0; i < 10; i++)
            System.out.print(rc.next() + " ");
    }

}
