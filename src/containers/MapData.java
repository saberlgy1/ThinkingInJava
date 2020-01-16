package containers;

import Generics.Generator;

import java.util.LinkedHashMap;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-09 16:33
 **/

public class MapData<K, V> extends LinkedHashMap<K, V> {


    public MapData(Generator<Pair<K, V>> gen, int quantity) {


        for (int i = 0; i < quantity; i++) {
            Pair<K, V> pair = gen.next();
            put(pair.key, pair.value);
        }

    }

    public MapData(Generator<K>genK, Generator<V> genV, int quantity) {
        for (int i = 0; i < quantity; i++){
            put(genK.next(),genV.next());
        }
    }

}
