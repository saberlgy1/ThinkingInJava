package Arrays;

import Generics.Generator;
import util.ConvertTo;
import util.Generated;
import util.RandomGenerator;

import java.util.Arrays;

/**
 * @program: ThinkingInJava
 * @description: 数组二分查找
 * @author: lgy
 * @create: 2019-11-20 14:18
 **/

public class ArraySearching {


    public static void main(String[] args) {

        Generator<Integer> gen = new RandomGenerator.Integer(1000);

        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                System.out.println(r + " " + location);
                break;
            }
        }

    }


}
