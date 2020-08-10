package HomeWork8;


import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("Hello");
        list.add(5);
        list.add(new Student("Bred"));

        for (Object o : list){
            System.out.println(o);
        }

//        MyList nextList = new MyList();
//        nextList.add(2);
//        nextList.add(3);
//        nextList.add(4);
//
//        System.out.println(list + " = Первый лист");
//        System.out.println(nextList + " = Второй лист");
//        System.out.println(list.size() + " = проверка размера первого листа");
//        System.out.println(list.isEmpty() + " = Проверка  isEmpty певрого листа");
//        System.out.println(list.contains("Hello") + " = Проверка contains первого листа");
//        System.out.println(list.remove("Hello") + " = Проверка remove первого листа " + list + " размер = " + list.size());
////        System.out.println(list.retainAll(nextList) + " = Проверка retainAll " + list);
////        System.out.println(list.addAll(nextList) + " = Проверка addAll " + list);
////        System.out.println(list.removeAll(nextList) + " = Проверка removeAll " + list);
//        System.out.println(list.containsAll(nextList) + " = Проверка containsAll " + list);
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.size());


    }
}
