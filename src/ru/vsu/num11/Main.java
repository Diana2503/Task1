package ru.vsu.num11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r = readRadius();
        double h = readHeight();
        outputValues(r, h);
    }

    public static double readRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius r = ");
        return scanner.nextDouble();
    }

    public static double readHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height h = ");
        return scanner.nextDouble();
    }

    public static double countVolume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static void outputValues(double r, double h) {
        System.out.print("Volume of the cylinder is " + countVolume(r, h));
    }
}

