package vsu.cs.ru.lesson3;

import java.util.Scanner;

public class PointReader {
    private Scanner scanner;

    public PointReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Point[] readPointsFromConsole() {
        System.out.println("Введите количество элементов массива: ");
        int countPoints = scanner.nextInt();
        Point[] points = new Point[countPoints];

        System.out.println("Введите координаты точек: ");
        for (int i = 0; i < countPoints; i++) {
            Double x = scanner.nextDouble();
            Double y = scanner.nextDouble();
            points[i] = new Point(x, y);
        }
        return points;
    }
}
