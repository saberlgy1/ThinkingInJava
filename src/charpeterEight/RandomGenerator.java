package charpeterEight;

import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-13 17:22
 **/

public class RandomGenerator {

    private Random random = new Random(46);
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Tringle();
            case 2: return new Square();

        }
    }


}
