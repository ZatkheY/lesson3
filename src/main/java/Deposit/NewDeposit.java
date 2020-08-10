package Deposit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class NewDeposit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your cash deposit: ");
        double cash = Integer.parseInt(reader.readLine());
        System.out.println("Enter percent: ");
        int percent = Integer.parseInt(reader.readLine());
        System.out.println("Enter period: ");
        int period = Integer.parseInt(reader.readLine());
        result(cash, percent, period);
    }

    public static void result(double cash, int percent, int period) {
        BigDecimal monthIncome = new BigDecimal(((cash / 100) * percent) / 12);
        double x = monthIncome.doubleValue();
        BigDecimal allIncome = new BigDecimal(x * (period * 12));
        BigDecimal yearIncome = new BigDecimal(x * 12);
        System.out.println("Income for the month = " + monthIncome.setScale(1, RoundingMode.DOWN) + " UAH");
        System.out.println("Year income = " + yearIncome.setScale(1, RoundingMode.DOWN) + " UAH");
        System.out.println("income for the entire period = " + allIncome.setScale(1, RoundingMode.DOWN) + " UAH");
    }
}
