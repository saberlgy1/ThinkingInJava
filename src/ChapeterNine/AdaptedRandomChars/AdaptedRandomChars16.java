package ChapeterNine.AdaptedRandomChars;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 16:55
 **/



public class AdaptedRandomChars16 extends RandomChars implements Readable {
    private int count;
    public AdaptedRandomChars16(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0) return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars16(10));
        while(s.hasNext())
            System.out.println(s.next() + " ");
    }
}
