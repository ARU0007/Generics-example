package main;

import printer.Printer;

public class Main {
    public static void main(String[] args) {

        //creating object and declaring generic type.
        //Second declaration is optional.
        Printer <Integer> Printer = new Printer<>(95);

        //calling print method.
        Printer.print();

    }
}

