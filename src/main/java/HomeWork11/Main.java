package HomeWork11;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyList list1 = new MyList();

        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        System.out.println(list + " Размер = " + list.size());

        list1.add(6);
        list1.add(1);
        list1.add(3);
        list1.add(7);
        System.out.println(list1 + " Размер = " + list1.size());
        System.out.println(list.removeAll(list1));

        System.out.println(list + " Размер = " + list.size());
    }
}
