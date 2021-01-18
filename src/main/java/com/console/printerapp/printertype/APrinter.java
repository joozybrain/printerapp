package com.console.printerapp.printertype;

public class APrinter {
    private int fontSize;

    public APrinter(int fontSize) {
        this.fontSize = fontSize;
    }

    public void printPattern() {
        int median = (int) Math.ceil((double) fontSize/2);
        for (int i = 1; i <= fontSize; i++) {
            for (int j = 1; j <= fontSize; j++) {
                if(i==1 && j==median) {
                    System.out.print("*");
                } else if (i != median && i > 1 && (j==median-i || j==median+i)) {
                    System.out.print("*");
                } else if (i == median) {
                    System.out.print("*");
                } else if (i > median && (j==1 || j==fontSize)) {
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
