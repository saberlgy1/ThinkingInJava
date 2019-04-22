package ChapterNine.Practice11;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 13:33
 **/

public class Apply {

    public static void process(Processor p, Object s){
        System.out.println("Using processor " + p);
        System.out.println(p.process(s));
    }

}
