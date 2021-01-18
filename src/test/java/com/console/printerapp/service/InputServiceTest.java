package com.console.printerapp.service;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class InputServiceTest {


    @Test
    void validateInput() {
        InputService inputService = new InputService();

        List<String> results = inputService.checkInputs("K21");
        System.out.println(results);
        Assertions.assertTrue(results.size() == 1);
    }

    @Test
    void testBlankSpaces() {
        String input = "X              21             ";
        System.out.println(StringUtils.deleteWhitespace(input));
    }
}