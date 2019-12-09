package Arrays;

import util.Generated;
import util.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description: 反向排序
 * @author: lgy
 * @create: 2019-11-20 14:35
 **/

public class Ex23 {

    private static Random r = new Random();

    public static void main(String[] args) {
        Integer[] ia = Generated.array(new Integer[20],
                new RandomGenerator.Integer(10));
        System.out.println(Arrays.toString(ia));
        Arrays.sort(ia,Collections.reverseOrder());
        System.out.println(Arrays.toString(ia));
    }

}
