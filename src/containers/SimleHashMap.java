package containers;

import util.Countries;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-04 17:33
 **/

public class SimleHashMap<K, V> extends AbstractMap<K, V> {

    static final int DEFAULT_CAPACITY = 997;
    static final int SIZE = 997;
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[DEFAULT_CAPACITY];


    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % DEFAULT_CAPACITY;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();


        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> lt = bucket.listIterator();
        int probes = 0;
        while (lt.hasNext()) {
            MapEntry<K, V> ipair = lt.next();
            probes ++;
            if (ipair.getKey().equals(key)) {

                oldValue = ipair.getValue();
                lt.set(pair);
                found = true;
                System.out.println("Collision at " +
                        ipair + ": " + probes + " probe"
                        + ((probes == 1) ? "" : "s") +
                        " needed");
                break;
            }
        }
        if (!found) {
            buckets[index].add(pair);
        }
        return oldValue;
    }


    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % DEFAULT_CAPACITY;
        if (buckets[index] == null) return null;
        for (MapEntry<K, V> iPair : buckets[index])
            if (iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry<K, V> entry : bucket)
                set.add(entry);
        }
        return set;

    }

    public static void main(String[] args) {
        SimleHashMap<String, String> m =
                new SimleHashMap<String, String>();
        m.putAll(Countries.capitals(10));
        System.out.println(m);
        m.put("EGYPT", "Berlin?");
        m.put("EGYPT", "Cairo");
        System.out.println(m);
        m.putAll(Countries.capitals(10));
    }


}
