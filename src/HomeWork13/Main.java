package HomeWork13;


public class Main {
    public static void main(String[] args) {
        MyOwnTreeSet myOwnTreeSet = new MyOwnTreeSet();
        myOwnTreeSet.add(11);
        myOwnTreeSet.add(9);
        myOwnTreeSet.add(1);
        myOwnTreeSet.add(11);

        MyOwnTreeSet myOwnTreeSet1 = new MyOwnTreeSet();
        myOwnTreeSet1.add(11);
        myOwnTreeSet1.add(9);
        myOwnTreeSet1.add(2);
        myOwnTreeSet1.add(8);
        System.out.println(myOwnTreeSet.retainAll(myOwnTreeSet1));
        System.out.println(myOwnTreeSet);
}
}
