package ru.netology.services;

public class RestService {
    public int calculate(int income, int threshold, int expenses) {
        int count = 0;
        int money = 0;
        for (int month = 1; month < 13; month++) {
            while (money < threshold) {
                money = money + income - expenses;
                month = month + 1;
                if (month >= 12) {
                    break;
                }
            }
            if (money > threshold) ;
            if (month >= 12) {
                break;
            }
            count = count + 1;
            money = (money - expenses) / 3;
            System.out.println(count);
        }
        return count;
    }
}