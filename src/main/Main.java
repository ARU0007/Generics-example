package main;

import printer.Printer;

public class Main {
    public static void main(String[] args) {

        //creating object and declaring generic type.
        //must use wrapper class not the primitv inside the <>.
        //Second declaration is optional.
        Printer <Integer> Printer = new Printer<>(95);

        //calling print method.
        Printer.print();

    }
}

