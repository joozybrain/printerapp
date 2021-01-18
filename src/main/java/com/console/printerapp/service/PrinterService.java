package com.console.printerapp.service;

import com.console.printerapp.printertype.*;

public class PrinterService {

    public static void getPrinter(String printerType, int fontSize) {

        switch (printerType.toUpperCase()) {
            case "X":
                XPrinter xPrinter = new XPrinter(fontSize);
                xPrinter.printPattern();
                break;
            case "Y":
                YPrinter yPrinter = new YPrinter(fontSize);
                yPrinter.printPattern();
                break;
            case "Z":
                ZPrinter zPrinter = new ZPrinter(fontSize);
                zPrinter.printPattern();
                break;
            case "A":
                APrinter aPrinter = new APrinter(fontSize);
                aPrinter.printPattern();
                break;
            case "U":
                UPrinter uPrinter = new UPrinter(fontSize);
                uPrinter.printPattern();
                break;
        }

    }
}
