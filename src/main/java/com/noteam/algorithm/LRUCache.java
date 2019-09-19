package com.noteam.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU Java 实现
 * @author Fuxin
 * @since 2019/8/30 14:06
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }
}
