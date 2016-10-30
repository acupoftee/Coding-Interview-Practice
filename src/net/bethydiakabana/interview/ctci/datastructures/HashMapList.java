package net.bethydiakabana.interview.ctci.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by diakabanab on 10/30/2016.
 */
public class HashMapList<K, V> {
    private HashMap<K, ArrayList<V>> map = new HashMap<K, ArrayList<V>>();

    /**
     * Inserts item into the list based on its key
     */
    public void put(K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<V>());
        }
        map.get(key).add(value);
    }
}
