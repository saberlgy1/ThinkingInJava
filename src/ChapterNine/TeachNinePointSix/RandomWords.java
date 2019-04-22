package ChapterNine.TeachNinePointSix;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 16:22
 **/

public class RandomWords implements Readable{
    private static Random random = new Random(49);
    private static final char[] captitals = "ADCBEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;
    public RandomWords(int count){
        this.count = count;
    }
    public int read(CharBuffer charBuffer){
        if (--count == 0){
            return -1;
        }
        charBuffer.append(captitals[random.nextInt(captitals.length)]);
        for (int i = 0; i < 4; i++){
            charBuffer.append(vowels[random.nextInt(vowels.length)]);
            charBuffer.append(lowers[random.nextInt(lowers.length)]);
        }
        charBuffer.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext()){
            System.out.println(s.next());
        }
    }
}
