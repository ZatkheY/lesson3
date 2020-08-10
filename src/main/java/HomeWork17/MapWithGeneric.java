package HomeWork17;

import java.util.*;

public class MapWithGeneric<K, V> implements Map<K, V> {
    private Entry[] data = new Entry[16];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        if (key == null) {
            return false;
        }
        return key.equals(findObject(key));
    }

    @Override
    public boolean containsValue(Object value) {
        if (value == null) {
            return false;
        }
        return value.equals(findObject(value));
    }

    @Override
    public V get(Object key) {
        for (Entry entry : data) {
            while (entry != null) {
                try {
                    if (entry.key.equals(key)) {
                        return (V) entry.value;
                    }
                } catch (NullPointerException e) {
                    System.err.println("INCORRECT DATA ENTRY");
                }
                entry = entry.next;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        Entry next = data[findingAnIndex(key)];
        if (size == data.length) {
            Entry[] newData = new Entry[data.length + 16];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[findingAnIndex(key)] = new Entry<K, V>(next, key, value);
        size++;
        return (V) data;
    }

    @Override
    public V remove(Object key) {
        V value = get(key);
        data[findingAnIndex(key)] = null;
        size--;
        return value;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        try {
            for (Map.Entry<? extends K, ? extends V> pair : m.entrySet()) {
                put(pair.getKey(), pair.getValue());
            }
        } catch (NullPointerException e) {
            System.err.println("INCORRECT DATA ENTRY");
        }
    }

    @Override
    public void clear() {
        data = new Entry[16];
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (Entry entry : data) {
            if (entry != null) {
                set.add((K) entry.key);
            }
        }
        return set;
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = new ArrayList<>();
        for (Entry entry : data) {
            if (entry != null) {
                collection.add((V) entry.value);
            }
        }
        return collection;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        for (Entry entry : data) {
            if (entry != null) {
                set.add(entry);
            }
        }
        return set;
    }

    private int findingAnIndex(Object key) {
        int finalResult = 0;
        try {
            int hashIndex = key.hashCode();
            int positiveIndex = Math.abs(hashIndex);
            finalResult = positiveIndex % data.length;
        } catch (NullPointerException e) {
            System.err.println("INCORRECT DATA ENTRY");
        }
        return finalResult;
    }

    private <T> T findObject(T object) {
        for (Entry entry : data) {
            while (entry != null) {
                try {
                    if (entry.key.equals(object) || entry.value.equals(object)) {
                        return object;
                    }
                } catch (NullPointerException e) {
                    System.err.println("INCORRECT DATA ENTRY");
                }
                entry = entry.next;
            }
        }
        return null;
    }


    private static class Entry<K, V> implements Map.Entry<K, V> {
        Entry next;
        K key;
        V value;

        Entry(Entry next, K key, V value) {
            this.next = next;
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }
    }
}
