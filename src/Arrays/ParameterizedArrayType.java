package Arrays;

/**
 * @program: ThinkingInJava
 * @description: 参数化数组
 * @author: lgy
 * @create: 2019-11-02 13:19
 **/

class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}


public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {
                1, 2, 3, 4, 5
        };
        Double[] doubles = {
                1.1, 2.2, 3.3, 4.5, 4.4
        };
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles1 = new ClassParameter<Double>().f(doubles);
        ints = MethodParameter.f(ints2);
        doubles = MethodParameter.f(doubles1);
    }

}
