package HomeWork9;


public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        MyCollection nextCollection = new MyCollection();
        collection.add("Hello");
        collection.add(3);
        collection.add(1);
        collection.add("Hello");
        collection.add("gg");

        nextCollection.add(3);
        nextCollection.add(1);
        nextCollection.add("Hello");
        nextCollection.add(new Student("Putin"));
        collection.printList();
        System.out.println(collection.remove(new Student("Putin")));
        System.out.println(collection.size());
        collection.printList();


    }
}
