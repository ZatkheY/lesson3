package HomeWork23;


public class Main {


    public static void main(String[] args) {
        System.out.println(pow(3, 2));
        System.out.println(Math.pow(3, -2));

    }

    public static double pow(double number, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow < 0) {
            number = 1.0 / number;
            pow = -pow;
        }
        double newPow = pow(number, pow / 2);
        newPow = newPow * newPow;
        if (pow % 2 != 0) {
            newPow = newPow * number;
        }
        return newPow;
    }

}
