package Arrays;

import util.ConvertTo;
import util.Generated;
import util.RandomGenerator;

import java.util.Random;
import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-11-20 14:34
 **/

public class Ex22 {
    private static Random r = new Random();
    public static void main(String[] args) {
        int[] ia = ConvertTo.primitive(Generated.array(new Integer[20],
                new RandomGenerator.Integer(10)));
        System.out.println(Arrays.toString(ia));
        for(int i = 0; i < 10; i++) {
            int index = Arrays.binarySearch(ia, i);
            if(index < 0) System.out.println(i + " not found");
            else
                System.out.println("Index: " + index + ", " + i);
        }
        System.out.println("sort");
        Arrays.sort(ia);
        System.out.println(Arrays.toString(ia));
        for(int i = 0; i < 10; i++) {
            int index = Arrays.binarySearch(ia, i);
            if(index < 0) System.out.println(i + " not found");
            else
                System.out.println("Index: " + index + ", " + i);
        }
    }
}