package CharpterSevenBefore;

import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-20 13:08
 **/

public class PassObject {

    public static void main(String[] args) {

        Random random = new Random(67);
        //int
        int i, j, k;
        j = random.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = random.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j + k: " + i);
        i = j - k;
        System.out.println("j - k: " + i);
        i = j / k;
        System.out.println("j / k: " + i);
        i = j * k;
        System.out.println("j * k: " + i);
        i = j % k;
        System.out.println("j % k: " + i);

        //float 适用于double
        float u, v, w;
        v = random.nextFloat();
        System.out.println("v: " + v);
        w = random.nextFloat();
        System.out.println("w: " + w);
        u = v + w;
        System.out.println("v + w: " + u);
        u = v - w;
        System.out.println("v - w: " + u);
        u = v * w;
        System.out.println("v * w: " + u);
        u = v / w;
        System.out.println("v / w: " + u);



    }

}
