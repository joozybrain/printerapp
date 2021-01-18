package com.console.printerapp.printertype;

public class ZPrinter {

    private int fontSize;

    public ZPrinter(int fontSize) {
        this.fontSize = fontSize;
    }

    public void printPattern() {
        for (int i = 1; i <= fontSize; i++) {
            for (int j = 1; j <= fontSize; j++) {
                if(i==1 || i == fontSize) {
                    System.out.print("*");
                } else if (j==fontSize-i+1) {
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
