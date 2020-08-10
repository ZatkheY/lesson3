package HomeWork4;


public class MyOwnContainer {
    public static void main(String[] args) {
        Array array = new Array();
        array.add(6);
        array.add(3);
        array.add(4);
        array.add(8);
        array.add(0);
        array.add(10);
        array.add(7);
        array.add(1);
        array.add(2);
        array.print();
        System.out.println(array.contains(10));
    }
}

