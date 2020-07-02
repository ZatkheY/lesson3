package HomeWork15;

import java.util.*;

public class MyMap implements Map {
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
        Entry entry = data[searchIndex(key)];
        while (entry != null) {
            try {
                if (entry.key.equals(key)) {
                    return true;
                }
            } catch (NullPointerException e) {

            }
            entry = entry.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Entry entry : data) {
            while (entry != null) {
                try {
                    if (entry.value.equals(value)) {
                        return true;
                    }
                } catch (NullPointerException e) {
                    System.err.println("Please print not null");
                }
                entry = entry.next;
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        Entry entry = data[searchIndex(key)];
        while (entry.key != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        Entry last = data[searchIndex(key)];
        if (size == data.length) {
            Entry[] newData = new Entry[data.length + 16];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[searchIndex(key)] = new Entry(last, key, value);
        size++;

        return data;
    }

    @Override
    public Object remove(Object key) {
        Entry entry = data[searchIndex(key)];
        while (entry != null) {
            if (entry.key.equals(key)) {
                data[searchIndex(key)] = null;
                size--;
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    @Override
    public void putAll(Map map) {
        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        data = new Entry[16];
        size = 0;
    }

    @Override
    public Set keySet() {
        HashSet<Object> set = new HashSet<>();
        for (Entry entry : data) {
            while (entry != null) {
                set.add(entry.key);
                entry = entry.next;
            }
        }
        return set;
    }

    @Override
    public Collection values() {
        List<Object> list = new ArrayList<>();
        for (Entry entry : data) {
            while (entry != null) {
                list.add(entry.value);
                entry = entry.next;
            }
        }
        return list;
    }

    @Override
    public Set<Map.Entry> entrySet() {
        Set<Map.Entry> entries = new HashSet<>();
        for (Entry datum : data) {
            if (datum != null) {
                entries.add(datum);
            }
        }
        return entries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyMap myMap = (MyMap) o;
        return Arrays.equals(data, myMap.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }

    private int searchIndex(Object key) {

        int result = key.hashCode();
        int positiveResult = Math.abs(result);
        return positiveResult % data.length;
    }

    private static class Entry implements Map.Entry {
        Entry next;
        Object key;
        Object value;

        private Entry(Entry next, Object key, Object value) {
            this.next = next;
            this.key = key;
            this.value = value;
        }

        @Override
        public Object getKey() {
            return key;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public Object setValue(Object newValue) {
            Object oldValue = value;
            value = newValue;
            return oldValue;
        }
    }
}
