package Generics.watercolors;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-06 17:12
 **/

public class ListMaker<T>{
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringListMaker = new ListMaker<>();
        List<String> list = stringListMaker.create();
        System.out.println(list.getClass().getSimpleName());
    }
}
