package Generics.Ex26;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-16 09:50
 **/

public class Ex26 {

    public static void main(String[] args) {
        Number[] numbers = new Integer[3];
        numbers[0] = new Integer(0);
        numbers[1] = new Integer(1);
        numbers[2] = new Integer(2);
        for(Number n : numbers)
            System.out.println(n);

        for(Number n : numbers)
            System.out.println(n.getClass().getSimpleName());
        List<? extends Number> nlist = new ArrayList<Integer>();
        // compile error: can't add Integer:
        // nlist.add(new Integer(0));
        nlist.add(null); // can add null
        Number x = nlist.get(0); // can get Number (null)
        System.out.println(nlist);

    }


}
