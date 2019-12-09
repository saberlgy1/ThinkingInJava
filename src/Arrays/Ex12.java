package Arrays;

import util.CountingGenerator;

import java.util.Arrays;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-11-19 13:11
 **/

public class Ex12 {

    public static void main(String[] args) {
        double[] doubles = new double[10];
        CountingGenerator.Double Gen = new CountingGenerator.Double();
        for (int i = 0 ; i < doubles.length; i++){
            doubles[i] = Gen.next();
            System.out.println(Arrays.toString(doubles));
        }
        System.out.println(fillString(10));
    }

    public static String fillString(int len) {
        CountingGenerator.Character cg = new CountingGenerator.Character();
        char[] ca = new char[len];
        for(int i = 0; i < len; i++)
            ca[i] = cg.next();
        return new String(ca);
    }



}
