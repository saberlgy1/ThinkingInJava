package Arrays;

import util.CountingGenerator;
import util.Generated;

import java.util.Arrays;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-11-19 12:43
 **/

public class TestGenerated {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));
        a = Generated.array(a, new CountingGenerator.Integer());
        System.out.println(Arrays.toString(a));
        Integer[] b = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
        System.out.println(Arrays.toString(b));

    }

}
