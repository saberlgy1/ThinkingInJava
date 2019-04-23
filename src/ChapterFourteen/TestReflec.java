package ChapterFourteen;

import ChapterFourteen.Ex25.A;
import ChapterFourteen.Ex25.Secret;

import java.lang.reflect.Method;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-23 20:32
 **/

public class TestReflec {
    public static void main(String[] args) throws Exception {
        A a = Secret.makeA();
        System.out.println("a" + a.getClass().getName());
        for (Method m: a.getClass().getDeclaredMethods()){
            m.setAccessible(true);
            m.invoke(a);
        }
    }

}
