package ChapeterNine.Practice11;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 13:32
 **/

public class StringMixerAdapter implements Processor{

    public String name() { return "StringMixerAdapter"; }
    StringMixer stringMixer;
    public StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }
    public String process(Object input) {
        return stringMixer.process((String)input);
    }

}
