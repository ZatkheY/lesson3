package Deposit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Deposit {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your cash deposit: ");
        double cash = Integer.parseInt(reader.readLine());
        System.out.println("Enter percent: ");
        int percent = Integer.parseInt(reader.readLine());
        System.out.println("Enter period: ");
        int period = Integer.parseInt(reader.readLine());
        result(cash,percent,period);
    }
    public static void result(double cash,int percent , int period){
        double monthIncome = ((cash/ 100) * percent) / 12;
        double allIncome = monthIncome * (period * 12);
        double yearIncome = monthIncome * 12;
        System.out.println(monthIncome);
        System.out.printf("Year income = %d UAH , income for the month = %d UAH, income for the entire period = %d UAH.",Math.round(yearIncome)  ,Math.round(monthIncome),Math.round(allIncome));
    }
}
