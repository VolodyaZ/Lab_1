package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

// VAR 6 : Calculate sin(x) using Taylor series
public class Main {
    public static void main(String[] args) {
        System.out.println("enter x: ");
        double x;
        int k;
        try (Scanner scanner = new Scanner(System.in)) {
            x = scanner.nextDouble();
            System.out.println("enter k: ");
            k = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("scanning went wrong");
            x = 0;
            k = 0;
        }
        System.out.printf("Taylor result is: %.3f \n", TaylorSin.countTaylor(x, Math.pow(10, -k)));
        System.out.printf("Actual result is: %.3f", Math.sin(x));
    }

    static class TaylorSin {
        public static Double countTaylor(double x, double approximation) {
            int counter = 2;
            double current = x;
            double result = 0;
            while (Math.abs(current) > approximation) {
                result += current;
                current = current * (-(x * x) / (counter++ * counter++));
            }
            return result;
        }
    }
}
