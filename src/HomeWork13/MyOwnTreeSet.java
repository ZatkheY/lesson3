package HomeWork13;

import java.util.*;

public class MyOwnTreeSet implements Collection {
    private List<Integer> hash = new ArrayList<>();
    private Node first;

    @Override
    public int size() {
        return getSize(first);
    }

    private int getSize(Node node) {
        if (node == null) {
            return 0;
        } else {
            return getSize(node.left) + 1 + getSize(node.right);
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object object) {
        return myContains((Integer) object, first) != null;
    }

    private Node myContains(Integer integer, Node node) {
        if (node == null) {
            return null;
        }
        if (node.data == integer) {
            return node;
        } else if (node.data > integer) {
            return myContains(integer, node.left);
        } else {
            return myContains(integer, node.right);
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Collections.sort(hash);
        Object[] newObject = new Object[size()];
        for (int i = 0; i < hash.size(); i++) {
            newObject[i] = hash.get(i);
        }
        return newObject;
    }

    @Override
    public boolean add(Object Object) {
        Integer toAdd = (Integer) Object;
        hash.add(toAdd);
        Node newNode = new Node(toAdd);
        if (first == null) {
            first = newNode;
        } else {
            addNewNode(first, toAdd);
        }
        return true;
    }

    private void addNewNode(Node node, Integer toAdd) {
        if (node.data == toAdd) {
            hash.remove(toAdd);
            return;
        } else if (node.data > toAdd) {
            if (node.left == null) {
                node.left = new Node(toAdd);
            } else {
                addNewNode(node.left, toAdd);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(toAdd);
            } else {
                addNewNode(node.right, toAdd);
            }
        }
    }

    @Override
    public boolean remove(Object object) {
        Integer integer = (Integer) object;
        hash.remove(integer);
        int currentSize = size();
        first = deleteNode(first, integer);
        return currentSize > size();
    }

    private Node deleteNode(Node current, Integer integer) {
        if (current == null) {
            return null;
        }
        if (current.data == integer) {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.right == null) {
                return current.left;
            } else if (current.left == null) {
                return current.right;
            }
            int smallNode = findSmallNode(current.right);
            current.data = smallNode;
            current.right = deleteNode(current.right, smallNode);
            return current;
        }
        if (integer < current.data) {
            current.left = deleteNode(current.left, integer);
            return current;
        } else {
            current.right = deleteNode(current.right, integer);
            return current;
        }
    }

    private int findSmallNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    @Override
    public boolean addAll(Collection collection) {
        for (int i = 0; i < collection.size(); i++) {
            add(collection.toArray()[i]);
        }
        return true;
    }

    @Override
    public void clear() {
        first = null;
        hash = new ArrayList<>();
    }

    @Override
    public boolean retainAll(Collection collection) {
        MyOwnTreeSet myOwnTreeSet = new MyOwnTreeSet();
        for (int i = 0; i < collection.size(); i++) {
            for (int j = 0; j < hash.size(); j++) {
                if (collection.toArray()[i] == hash.get(j)) {
                    myOwnTreeSet.add(collection.toArray()[i]);
                    break;
                }
            }
        }
        clear();
        this.addAll(myOwnTreeSet);
        return size() > 0;
    }

    @Override
    public boolean removeAll(Collection collection) {
        for (int i = 0; i < collection.size(); i++) {
            remove(collection.toArray()[i]);
        }
        return size() > 0;
    }

    @Override
    public boolean containsAll(Collection collection) {
        MyOwnTreeSet myOwnTreeSet = new MyOwnTreeSet();
        for (int i = 0; i < collection.size(); i++) {
            for (int j = 0; j < hash.size(); j++) {
                if (collection.toArray()[i] == hash.get(j)) {
                    myOwnTreeSet.add(collection.toArray()[i]);
                    break;
                }
            }
        }
        return size() == myOwnTreeSet.size();
    }

    @Override
    public Object[] toArray(Object[] array) {
        if (array.length > size()) {
            Collections.sort(hash);
            Object[] newObject = new Object[array.length];
            for (int i = 0; i < hash.size(); i++) {
                newObject[i] = hash.get(i);
            }
            return newObject;
        } else {
            Collections.sort(hash);
            for (int i = 0; i < hash.size(); i++) {
                array[i] = hash.get(i);
            }
            return array;
        }
    }

    @Override
    public String toString() {
        return print(first);
    }

    private String print(Node node) {
        if (node == null) {
            return "";
        }
        String left = print(node.left);
        String first = String.valueOf(node.data);
        String right = print(node.right);

        String result = "";
        return result + left + " " + first + " " + right;
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
