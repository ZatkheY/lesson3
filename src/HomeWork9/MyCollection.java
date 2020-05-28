package HomeWork9;

import java.util.Iterator;
import java.util.Collection;

public class MyCollection implements Collection {
    private Object[] collection = new Object[0];
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
    public boolean contains(Object object) {
        for (Object o : collection) {
            if (o.equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        return (int) collection[index];
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }

    @Override
    public boolean add(Object object) {
        if (size == collection.length) {
            Object[] newObject = new Object[collection.length + 10];
            System.arraycopy(collection, 0, newObject, 0, collection.length);
            collection = newObject;
        }
        collection[size] = object;
        size++;
        return true;
    }

    void printList() {
        String str = "";
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] != null) {
                str += collection[i] + ", ";
            }
        }
        if (!str.isEmpty()) {
            str = str.substring(0, str.length() - 2);
        }
        System.out.println("[" + str + "]");
    }

    @Override
    public boolean remove(Object object) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == null) {
                continue;
            }
            if (collection[i].equals(object)) {
                collection[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection newCollection) {
        int firstCollection = collection.length;
        int secondCollection = newCollection.size();
        Object[] newObject = new Object[firstCollection + secondCollection];
        for (int i = 0; i < firstCollection; i++) {
            newObject[i] = collection[i];
        }
        for (int i = firstCollection; i < newObject.length; i++) {
            newObject[i] = newCollection.toArray()[i - firstCollection];
        }
        collection = newObject;
        size = this.size + newCollection.size();
        return true;
    }

    @Override
    public void clear() {
        collection = new Object[0];
        size = 0;
    }

    @Override
    public boolean retainAll(Collection newCollection) {
        Object[] newObject = new Object[collection.length + newCollection.size()];
        int length = 1;
        int newSize = 0;
        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < newCollection.size(); j++) {
                if (collection[i] == null) {
                    continue;
                }
                if (collection[i].equals(newCollection.toArray()[j])) {
                    if (collection[i] != null) {
                        newObject[length - 1] = collection[i];
                        newSize++;
                        length++;
                    }
                }
            }
        }
        collection = newObject;
        size = newSize;
        return newSize > 0;
    }

    @Override
    public boolean removeAll(Collection newCollection) {
        int maxCount = newCollection.size();
        int count = 0;
        int length = 1;
        int newSize = 0;
        Object[] newObject = new Object[collection.length + newCollection.size()];
        for (int i = 0; i < collection.length; i++) {
            count = 0;
            for (int j = 0; j < newCollection.size(); j++) {
                if (collection[i] == null) {
                    continue;
                }
                if (!(collection[i].equals(newCollection.toArray()[j]))) {
                    count++;
                }
            }
            if (count == maxCount) {
                newObject[length - 1] = collection[i];
                newSize++;
                length++;
            }
        }
        collection = newObject;
        size = newSize;
        return newSize > 0;
    }

    @Override
    public boolean containsAll(Collection newCollection) {
        int maxCount = collection.length;
        int result = 0;
        int count = 0;
        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < newCollection.size(); j++) {
                count = 0;
                if (collection[i] == null) {
                    result++;
                    break;
                }
                if (collection[i].equals(newCollection.toArray()[j])) {
                    count++;
                }
                if (count > 0) {
                    result++;
                    break;
                }
            }
        }
        return maxCount == result;
    }

    @Override
    public Object[] toArray() {
        Object[] newObject = new Object[collection.length];
        System.arraycopy(collection, 0, newObject, 0, collection.length);
        return newObject;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        if (objects.length < collection.length) {
            Object[] newObject = new Object[collection.length];
            for (int i = 0; i < newObject.length; i++) {
                newObject[i] = collection[i];
            }
            return newObject;
        } else {
            for (int i = 0; i < collection.length; i++) {
                objects[i] = collection[i];
            }
            return objects;
        }
    }
}
