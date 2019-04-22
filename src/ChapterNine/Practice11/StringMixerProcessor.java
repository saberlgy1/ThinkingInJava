package ChapterNine.Practice11;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 13:33
 **/

public class StringMixerProcessor {

    public static void main(String[] args) {

        String s = new String("i am liu guangyuan");
        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }

}
