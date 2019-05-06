package Generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-05 15:27
 **/
class New{
    public static <K, V> Map<K, V> map(){
        return new HashMap<K, V>();
    }
}
public class ExplictTypeSpecification {
    static void f(Map<String, List<String>> map){}

    public static void main(String[] args) {
        f(New.<String, List<String>>map());
    }
}
