package com.console.printerapp.printertype;

public class YPrinter {

    private int fontSize;

    public YPrinter(int fontSize) {
        this.fontSize = fontSize;
    }

    public void printPattern() {
        int median = (int) Math.ceil((double) fontSize/2);
        for (int i = 1; i <= fontSize; i++) {
            for (int j = 1; j <= fontSize; j++) {
                if ((j==i || j==fontSize-i+1) && i <= median){
                    System.out.print("*");
                } else if (i >= median && j == median)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
