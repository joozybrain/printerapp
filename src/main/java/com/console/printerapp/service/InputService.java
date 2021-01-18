package com.console.printerapp.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class InputService {

    public static String PRINTER_TYPE;
    public static int FONT_SIZE;

    public List<String> checkInputs(String inputs) {
        int fontSize = 0;
        List<String> errors = new ArrayList<>();

        if ((inputs.length() < 4 && inputs.length() == 1) || inputs.length() == 0) {
            errors.add("Please enter only 2 or 3 characters");
            return errors;
        }

        String[] parsedInputs = new String[2];
        inputs = StringUtils.deleteWhitespace(inputs);
        parsedInputs[0] = inputs.substring(0,1);
        parsedInputs[1] = inputs.substring(1);
        fontSize = Integer.parseInt(parsedInputs[1]);

        if ((fontSize < 3 || fontSize > 21) || (fontSize % 2 == 0)) {
            errors.add("Font Size can only be between 3 to 21 and must be odd number");
        }

        if (!Pattern.matches("[xyzau]",parsedInputs[0].toLowerCase())) {
            errors.add("Must be only X, Y, Z, A, U");
        }

        PRINTER_TYPE = parsedInputs[0];
        FONT_SIZE = fontSize;

        return errors;
    }
}
