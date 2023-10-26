package ru.netology.services;

public class RestService {

    public int calculate(int income, int threshold, int expenses) {
        ;
        int money = 0;
        int count = 0;
        for (int month = 1; month < 13; month++) {
            if (money < threshold) {
                money = (money + income - expenses);
            } else {
                money = (money - expenses) / 3;
                {count=count+1;}
          System.out.println(count);  }
        }
        return count;
    }
}
