package com.console.printerapp.printertype;

public class XPrinter {

    private int fontSize;

    public XPrinter(int fontSize) {
       this.fontSize = fontSize;
    }

    public void printPattern() {

        for(int i = 1; i <= fontSize; i++) {

            for(int j = 1; j <= fontSize; j++) {
                if(j==i || j==fontSize-i+1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
