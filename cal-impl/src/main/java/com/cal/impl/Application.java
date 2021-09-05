package com.cal.impl;

import javax.xml.transform.Result;
import java.util.Scanner;
import com.cal.api.Calculator;
public class Application {
    public static void main(String[] args) {
        int choice = 0;
        int result1 = 0;
        int result2 = 0;


        System.out.println("Choose the operation('+', '-', '*', '/')");
        System.out.println(" Enter 1 for Addition");
        System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multiplication");
        System.out.println(" Enter 4 for Division");


        Scanner in = new Scanner(System.in);
        System.out.println("enter a choice");
        choice = in.nextInt();

        System.out.println("enter first number");
        result1 = in.nextInt();
        System.out.println("enter second number");
        result2 = in.nextInt();

        Calculator cal = new Calculator(result1, result2, choice);
        System.out.println("Result = " +cal.result);
    }
}
