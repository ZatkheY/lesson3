package HomeWork8;


import java.util.Collection;
import java.util.Iterator;

class MyList implements Collection {
    private List first;
    private int size = 0;

    MyList() {
        first = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public boolean add(Object object) {
        List newList = new List(object);
        if (first == null) {
            first = newList;
            size++;
            return true;
        }
        List list = first;
        int count = 0;
        while (list != null) {
            if (count == size - 1) {
                list.next = newList;
                size++;
                return true;
            }
            list = list.next;
            count++;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object object) {
        List list = first;
        while (list != null) {
            if (list.data.equals(object)) {
                return true;
            }
            list = list.next;
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (isEmpty()) {
            return false;
        }
        if (first.data.equals(object)) {
            first = first.next;
            size--;
            return true;
        }
        List previous = first;
        List current = first;
        while (current != null) {
            if (current.data.equals(object)) {
                previous.next = current.next;
                size--;
                return true;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        for (int i = 0; i < collection.size(); i++) {
            add(collection.toArray()[i]);
        }
        return true;
    }


    @Override
    public boolean retainAll(Collection collection) {
        List list = first;
        int count;
        while (list != null) {
            count = 0;
            for (int i = 0; i < collection.size(); i++) {
                if (!list.data.equals(collection.toArray()[i])) {
                    count++;
                }
                if (count == collection.size()) {
                    remove(list.data);
                }
            }
            list = list.next;
        }
        return size > 0;
    }

    @Override
    public boolean removeAll(Collection collection) {
        List list = first;
        while (list != null) {
            for (int i = 0; i < collection.size(); i++) {
                if (list.data.equals(collection.toArray()[i])) {
                    remove(list.data);
                }
            }
            list = list.next;
        }
        return size > 0;
    }

    @Override
    public boolean containsAll(Collection collection) {
        List list = first;
        int count = 0;
        int result = 0;
        int maxCount = collection.size();
        while (list != null) {
            for (int i = 0; i < collection.size(); i++) {
                if (list.data.equals(collection.toArray()[i])) {
                    count++;
                }
                if (count > 0) {
                    result++;
                    count = 0;
                }
            }
            list = list.next;
        }
        return result == maxCount;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Object next() {
                List list = first;
                for (int i = 0; i < size; i++) {
                    if (i == index) {
                        index++;
                        return list.data;
                    }
                    list = list.next;
                }
                return first;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] newObject = new Object[size];
        List list = first;
        int i = 0;
        while (list != null) {
            newObject[i] = list.data;
            i++;
            list = list.next;
        }
        return newObject;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        if (objects.length > size) {
            objects = toArray();
            return objects;
        } else {
            List list = first;
            int i = 0;
            while (list != null) {
                objects[i] = list.data;
                i++;
                list = list.next;
            }
            return objects;
        }
    }

    @Override
    public String toString() {
        String result = "";
        List current = first;
        while (current != null) {
            result += current.data + ", ";
            current = current.next;
        }
        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 2);
        }
        return "[" + result + "]";
    }

    private static class List {
        Object data;
        List next;

        List(Object data) {
            this.data = data;
        }
    }
}
