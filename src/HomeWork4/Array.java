package HomeWork4;

import java.util.Arrays;

class Array {
    private int[] container = new int[0];

    void add(int num) { //Добавление нового элемента.
        int length = container.length;
        greatArray();
        container[length] = num;
    }

    private void greatArray() { // Создаем новый массив на одну ячейку больше.
        int[] newContainer = new int[container.length + 1];
        System.arraycopy(container, 0, newContainer, 0, container.length);
        container = newContainer;
    }

    void println() { // Выводим в консоль каждый элемент с новой строки.
        for (int value : container) {
            System.out.println(value);
        }
    }

    void print() {  // Выводим в консоль.
        for (int value : container) {
            System.out.print(value + " ");
        }
    }

    void arrayToString() {
        System.out.println(Arrays.toString(container));
    }

    int get(int element) {  // Достаем по индексу.
        return container[element];
    }

    boolean contains(int element) {  // Проверяем есть ли нужный нам элемент в контейнере.
        for (int value : container) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }

    void addAll(Array array) {  // Добавляем эелемент с одного массива в другой.
        int firstLength = container.length;
        int secondLength = array.container.length;
        int newLength = firstLength + secondLength;
        int[] newContainer = new int[newLength];
        System.arraycopy(container, 0, newContainer, 0, container.length);
        System.arraycopy(array.container, 0, newContainer, firstLength, array.container.length);
            container = newContainer;
        }



    boolean equals(int firstElement, int secondElement) {  // Возвращает True если элементы равны.
        return container[firstElement] == container[secondElement];
    }

    void clear() {  // Создаем новый пустой массив и присваеваем в старый.
        container = new int[0];
    }

    void indexOf(int element) { // Выводим в консоль элемент по индексу.
        for (int i = 0; i < container.length; i++) {
            if (container[i] == element) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("element not found");
    }

    void getSize() { // Выводим в консоль длину массива.
        System.out.println(container.length);
    }

    void ascendingSort() {  //Сортировка по возрастанию.
        Arrays.sort(container);
    }

    void descendingSort() {  //Сортировка пузырьком по убыванию.
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < container.length - 1; i++) {
                if (container[i] < container[i + 1]) {
                    temp = container[i];
                    container[i] = container[i + 1];
                    container[i + 1] = temp;
                    sorted = false;
                }

            }
        }
    }
}





