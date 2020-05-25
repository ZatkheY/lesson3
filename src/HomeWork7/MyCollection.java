package HomeWork7;

public class MyCollection {
    private Object[] collection = new Object[0];
    private int size = 0;

    void print() {
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

    void add(Object object) {
        if (size == collection.length) {
            createNewObject();
        }
        collection[size] = object;
        size++;
    }

    private void createNewObject() {
        Object[] newObject = new Object[collection.length + 10];
        for (int i = 0; i < collection.length; i++) {
            newObject[i] = collection[i];
        }
        collection = newObject;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean contains(Object object) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    boolean remove(Object object) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].equals(object)) {
                collection[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    boolean addAll(MyCollection newCollection) {
        int firstCollection = collection.length;
        int secondCollection = newCollection.collection.length;
        Object[] newObject = new Object[firstCollection + secondCollection];
        for (int i = 0; i < firstCollection; i++) {
            newObject[i] = collection[i];
        }
        for (int i = firstCollection; i < newObject.length; i++) {
            newObject[i] = newCollection.collection[i - firstCollection];
        }
        collection = newObject;
        size = this.size + newCollection.size;
        return true;
    }

    void clear() {
        collection = new Object[0];
        size = 0;
    }

    boolean retainAll(MyCollection newCollection) {
        Object[] newObject = new Object[collection.length + newCollection.collection.length];
        int length = 1;
        int newSize = 0;
        for (int i = 0; i < collection.length; i++) {  // 315
            for (int j = 0; j < newCollection.collection.length; j++) {
                if (collection[i] == null) {
                    break;
                }
                if (collection[i].equals(newCollection.collection[j])) {
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
        return true;
    }

    boolean removeAll(MyCollection newCollection) {
        int maxCount = newCollection.collection.length;
        int count = 0;
        int length = 1;
        int newSize = 0;
        Object[] newObject = new Object[collection.length + newCollection.collection.length];
        for (int i = 0; i < collection.length; i++) {
            count = 0;
            for (int j = 0; j < newCollection.collection.length; j++) {
                if (collection[i] == null) {
                    break;
                }
                if (!(collection[i].equals(newCollection.collection[j]))) {
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
        return true;
    }

    boolean containsAll(MyCollection newCollection) {
        int maxCount = collection.length;
        int result = 0;
        int count = 0;
        for (int i = 0; i < newCollection.collection.length; i++) {
            for (int j = 0; j < collection.length; j++) {
                count = 0;
                if (newCollection.collection[i] == null) {
                    result++;
                    break;
                }
                if (newCollection.collection[i].equals(collection[j])) {
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
}





