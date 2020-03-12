package containers;

import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-04 14:51
 **/

public class Prediction {
    private static Random random = new Random(47);
    private boolean shadow = random.nextDouble() > 0.5;

    @Override
    public String toString() {
        if (shadow){
            return "shdow";
        }
        return "unshadow" ;
    }
}
