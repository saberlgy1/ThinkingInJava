package containers;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-09 16:32
 **/

public class Pair<K, V> {


    public final K key;

    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
