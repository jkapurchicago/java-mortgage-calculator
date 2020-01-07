package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import javax.script.ScriptContext;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12; //this is your n
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Principal: ");

        int principal = scanner.nextInt();

        System.out.print("What is your Annual Interest Rate: ");   //
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; //

        System.out.print("Period (Years):");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("your monthly payments are: " + mortgageFormatted);
    }
}

