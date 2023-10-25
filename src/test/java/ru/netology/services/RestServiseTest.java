package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiseTest {


    @CsvFileSource(files = "src/test/resources/Rest.csv")
    @ParameterizedTest
    public void Rest(int income, int threshold, int expenses, int expected) {
        RestService service = new RestService();
        int actual = service.calculate(income, threshold, expenses);
        Assertions.assertEquals(expected, actual);
    }
}

