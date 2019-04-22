package ChapterNine.TeachNine;

import java.util.Arrays;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-15 17:09
 **/


class Splitter {
    String process(Object input){
        System.out.println(Arrays.toString(((String)input).split("ee")));
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void main(String[] args) {
        Splitter splitter = new Splitter();
        splitter.process("Disaggreement");
    }
}
