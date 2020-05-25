package HomeWork7;

public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        MyCollection nextCollection = new MyCollection();


        collection.add(new Student("Bred"));
        collection.add(3);
        collection.add("Hello");
        collection.add(4);
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.add(5);
        collection.remove("Hello");
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains(new Student("Bred")));
        nextCollection.add(3);
        nextCollection.add("Hello");
        nextCollection.add(new Student("Bred"));
        nextCollection.add("ggg");
        nextCollection.add(4);
        collection.print();
        System.out.println(collection.retainAll(nextCollection));
        collection.print();
        System.out.println(collection.size());
        collection.size();
        collection.clear();
        collection.print();
        System.out.println(collection.isEmpty());



    }

}
