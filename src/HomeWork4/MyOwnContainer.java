package HomeWork4;


public class MyOwnContainer {
    public static void main(String[] args) {
        Array array = new Array();
        Array array1 = new Array();
        array.add(1);// Добовляем число в контейнер.
        array.add(9);
        array.add(8);
        array.add(10);
        array.add(6);
        array.add(7);
        array.add(-1);
        array.add(3);
        array.add(2);
        array.add(0);
        array.add(4);
        array.add(5);
        array.arrayToString(); // Выводим не отсортированный контейнер.
        array.ascendingSort(); // Сортируем по возростанию.
        array.arrayToString(); // Выводим в консоль .
        array.descendingSort();// Сортируем по убыванию.
        array.arrayToString(); // Выводим в консоль .
        System.out.println(array.get(4)); // Достаем число по индексу.
        array.indexOf(-1); // Находим индекс элемента.
        System.out.println(array.contains(10)); // Находит элемент в контейнере.
        System.out.println(array.equals(3, 5)); // Сравнивает два эелемента в контейнере по индексу.
        array1.addAll(array);  // копируем с одного контейнера в другой.
        array1.print();
        System.out.println();
        array.getSize(); // Выводит в консоль размер контейнера.
        array.clear(); // Удоляет все элементы в контейнере.
    }
}

