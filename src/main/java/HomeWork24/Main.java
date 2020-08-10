package HomeWork24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(2.0);
        list.add(2.0);
        list.add(-2.0);
        list.add(2.5);
        list.add(2.0);
        System.out.println(doubleMean(list));
        System.out.println(sumPow(list));
    }

    private static double doubleMean(List<Double> numbers) {
        return sumNumbers(numbers) / numbers.size();
    }

    private static double sumPow(List<Double> numbers) {
        List<Double> list = new ArrayList<>();
        double result;
        for (Double number : numbers) {
            if (number > 0) {
                result = number * number;
                if (result % 2 == 0) {
                    list.add(result);
                }
            }
        }
        return sumNumbers(list);
    }

    private static double sumNumbers(List<Double> numbers) {
        double result = 0;
        for (Double number : numbers) {
            result = result + number;
        }
        return result;
    }
}
