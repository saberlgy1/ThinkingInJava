package containers;

import util.RandomGenerator;

import java.util.TreeSet;

import static util.Print.print;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-01-16 17:08
 **/

public class Ex9 {
    public static void main(String[] args) {
        TreeSet<String> ts =
                new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        RandomGenerator.String rgs =
                new RandomGenerator.String(5);
        for(int i = 0; i < 20; i++) {
            ts.add(rgs.next());
        }
        print(ts);
    }
}
