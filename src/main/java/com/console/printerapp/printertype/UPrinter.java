package com.console.printerapp.printertype;

public class UPrinter {
    private int fontSize;

    public UPrinter(int fontSize) {
        this.fontSize = fontSize;
    }

    public void printPattern() {
        for (int i = 1; i <= fontSize; i++) {
            for (int j = 1; j <= fontSize; j++) {
                if(i == fontSize) {
                    System.out.print("*");
                } else if (j==1 || j==fontSize) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
