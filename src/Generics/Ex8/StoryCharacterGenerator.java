package Generics.Ex8;

import Generics.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-01 14:43
 **/

public class StoryCharacterGenerator implements Generator<StoryCharacter>,  Iterable<StoryCharacter>{

    private Class[] types = {
            DarthVader.class, JabbaTheHut.class,
            LukeSkywalker.class, Yoda.class
    };
    private Random random = new Random();

    public StoryCharacterGenerator() {
    }

    private int size = 0;
    public StoryCharacterGenerator(int sz) { size = sz; }
    public StoryCharacter next() {
        try {
            return
                    (StoryCharacter)types[random.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    class StoryCharacterIterator implements Iterator<StoryCharacter> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public StoryCharacter next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }
    @Override
    public Iterator<StoryCharacter> iterator() {
        return new StoryCharacterIterator();
    }

    public static void main(String[] args) {
        StoryCharacterGenerator gen = new StoryCharacterGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(StoryCharacter s : new StoryCharacterGenerator(5))
            System.out.println(s);
    }
}
