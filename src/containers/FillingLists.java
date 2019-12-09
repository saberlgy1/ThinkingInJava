package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-11-21 16:00
 **/


class StringAddress{
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "StringAddress{" +
                "s='" + s + '\'' +
                '}';
    }
}

public class FillingLists {

    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4,new StringAddress("hello")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("word"));
        System.out.println(list);
    }

}
