package vsu.cs.ru.lesson1;

import java.util.Scanner;

public class FigureFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double square = getSquare(radius);
        System.out.println(square);
    }

    /**
     * Вычислить площадь круга по радиусу
     */
    public static double getSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
