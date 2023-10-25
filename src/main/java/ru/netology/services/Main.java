package ru.netology.services;

import ru.netology.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        System.out.println();
        service.calculate(100_000, 150_000, 60_000);

    }
}
