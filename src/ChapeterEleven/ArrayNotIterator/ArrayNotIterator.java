package ChapeterEleven.ArrayNotIterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-27 11:12
 **/

public class ArrayNotIterator {
    static <T> void test(Iterable<T> iterator){
        for (T t: iterator
             ) {
            System.out.print(t + "");
        }
    }

    public static void main(String[] args) {
        String[] s = {"a", "b", "c"};
        test(Arrays.asList(s));

    }
}
