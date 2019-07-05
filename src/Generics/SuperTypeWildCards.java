package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-16 13:10
 **/

public class SuperTypeWildCards {
    static  void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Joth());
        System.out.println(apples);
    }

    public static void main(String[] args) {
        List<? super Apple> apples = new ArrayList<>();
        writeTo(apples);
    }
}
