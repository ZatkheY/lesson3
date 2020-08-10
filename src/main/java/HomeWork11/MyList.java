package HomeWork11;


import java.util.*;

public class MyList implements List {
    private Object[] MyOwnList = new Object[0];


    @Override
    public int size() {
        return MyOwnList.length;
    }

    @Override
    public boolean isEmpty() {
        return MyOwnList.length == 0;
    }

    @Override
    public boolean contains(Object object) {
        for (Object o : MyOwnList) {
            if (o.equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < MyOwnList.length;
            }

            @Override
            public Object next() {
                return MyOwnList[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] newObject = new Object[MyOwnList.length];
        System.arraycopy(MyOwnList, 0, newObject, 0, MyOwnList.length);
        return newObject;
    }

    @Override
    public boolean add(Object object) {
        Object[] newObject = new Object[MyOwnList.length + 1];
        System.arraycopy(MyOwnList, 0, newObject, 0, MyOwnList.length);
        newObject[MyOwnList.length] = object;
        MyOwnList = newObject;
        return true;
    }

    @Override
    public boolean remove(Object object) {
        Object[] newObject = new Object[MyOwnList.length - 1];
        for (int i = 0; i < MyOwnList.length; i++) {
            if (MyOwnList[i].equals(object)) {
                if (MyOwnList.length - 1 - i >= 0)
                    System.arraycopy(MyOwnList, i + 1, MyOwnList, i, MyOwnList.length - 1 - i);
            }
        }
        System.arraycopy(MyOwnList, 0, newObject, 0, newObject.length);
        MyOwnList = newObject;
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        for (int i = 0; i < collection.size(); i++) {
            add(collection.toArray()[i]);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection collection) {
        int firstLengthList = MyOwnList.length;
        int secondLengthList = collection.size();
        Object[] newObject = new Object[firstLengthList + secondLengthList];
        for (int i = 0; i < index; i++) {
            newObject[i] = MyOwnList[i];
        }
        for (int i = index; i < index + secondLengthList; i++) {
            newObject[i] = collection.toArray()[i - index];
        }
        for (int i = index + secondLengthList; i < newObject.length; i++) {
            newObject[i] = MyOwnList[i - secondLengthList];
        }
        MyOwnList = newObject;
        return true;
    }

    @Override
    public void sort(Comparator comparator) {
        Arrays.sort(MyOwnList);
    }

    @Override
    public void clear() {
        MyOwnList = new Object[0];
    }

    @Override
    public Object get(int index) {
        return MyOwnList[index];
    }

    @Override
    public Object set(int index, Object element) {
        return MyOwnList[index] = element;
    }

    @Override
    public void add(int index, Object element) {
        Object[] newObject = new Object[MyOwnList.length + 1];
        newObject[index] = element;
        System.arraycopy(MyOwnList, 0, newObject, 0, index);
        for (int i = index + 1; i < newObject.length; i++) {
            newObject[i] = MyOwnList[i - 1];
        }
        MyOwnList = newObject;
    }


    @Override
    public Object remove(int index) {
        Object[] newObject = new Object[MyOwnList.length - 1];
        if (index < MyOwnList.length) {
            for (int i = index; i < MyOwnList.length - 1; i++) {
                MyOwnList[i] = MyOwnList[i + 1];
            }
            System.arraycopy(MyOwnList, 0, newObject, 0, newObject.length);
        } else {
            System.arraycopy(MyOwnList, 0, newObject, 0, newObject.length);
        }
        return MyOwnList = newObject;

    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < MyOwnList.length; i++) {
            if (MyOwnList[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int result = -1;
        for (int i = 0; i < MyOwnList.length; i++) {
            if (MyOwnList[i].equals(o)) {
                result = i;
            }
        }
        return result;
    }

    @Override
    public ListIterator listIterator() {
        return new MyOwnListIterator(0);
    }

    @Override
    public ListIterator listIterator(int index) {
        return new MyOwnListIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        MyList list = new MyList();
        list.addAll(Arrays.asList(MyOwnList).subList(fromIndex, toIndex));
        return list;
    }

    @Override
    public boolean retainAll(Collection collection) {
        MyOwnList = repeatObject(MyOwnList, collection);
        return MyOwnList.length > 0;
    }

    @Override
    public boolean removeAll(Collection collection) {
        Object[] newObject = repeatObject(MyOwnList, collection);
        for (Object object : newObject) {
            remove(object);
        }
        return MyOwnList.length > 0;
    }

    @Override
    public boolean containsAll(Collection collection) {
        Object[] newObject = repeatObject(MyOwnList, collection);
        return MyOwnList.length == newObject.length;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        if (objects.length > MyOwnList.length) {
            Object[] newObject = new Object[MyOwnList.length];
            System.arraycopy(MyOwnList, 0, newObject, 0, newObject.length);
            return newObject;
        } else {
            System.arraycopy(MyOwnList, 0, objects, 0, MyOwnList.length);
            return objects;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(MyOwnList);
    }

    private Object[] repeatObject(Object[] objects, Collection collection) {
        MyList list = new MyList();
        for (Object object : objects) {
            for (int j = 0; j < collection.size(); j++) {
                if (object.equals(collection.toArray()[j])) {
                    list.add(object);
                    break;
                }
            }
        }
        return list.toArray();
    }


    private class MyOwnListIterator implements ListIterator {
        private int index;
        private int previousIndex = MyOwnList.length;

        MyOwnListIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index < MyOwnList.length;
        }

        @Override
        public Object next() {
            return MyOwnList[index++];
        }

        @Override
        public boolean hasPrevious() {
            return previousIndex > 0;
        }

        @Override
        public Object previous() {
            return MyOwnList[previousIndex--];
        }

        @Override
        public int nextIndex() {
            return index++;
        }

        @Override
        public int previousIndex() {
            if (previousIndex > 0) {
                return previousIndex--;
            } else {
                return -1;
            }
        }

        @Override
        public void remove() {
            MyList.this.remove(index);
        }

        @Override
        public void set(Object object) {
            MyList.this.set(index, object);
        }

        @Override
        public void add(Object object) {
            MyList.this.add(index, object);
        }
    }
}
