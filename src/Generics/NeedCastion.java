package Generics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-08 10:34
 **/

public class NeedCastion {

    public void f(String[] s)throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(s[0]));
        List<Widget> sha = (List<Widget>)in.readObject();
    }

}
