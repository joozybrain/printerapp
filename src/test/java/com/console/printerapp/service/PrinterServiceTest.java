package com.console.printerapp.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrinterServiceTest {

    @Test
    void getPrinter() {
        PrinterService.getPrinter("Z",3);
        PrinterService.getPrinter("Y",3);
        PrinterService.getPrinter("X",3);
        PrinterService.getPrinter("U",3);
        PrinterService.getPrinter("A",3);
    }
}