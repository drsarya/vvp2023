package vsu.cs.ru.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointReader pointReader = new PointReader(scanner);
        System.out.println("Вводить точки необходимо в порядке обхода многоугольника");
        Point[] elements = pointReader.readPointsFromConsole();
        double squareOfPolygon = getSquareOfPolygon(elements);

        System.out.printf("Площадь многоугольника равна %f", squareOfPolygon);
    }

    /**
     * Метод вычисляет площадь многоугольника с помощью формулы Гаусса
     *
     * @param points массив точек
     * @return площадь многоугольника
     */
    public static double getSquareOfPolygon(Point[] points) {
        double square = 0;
        for (int i = 0; i < points.length; i++) {
            int nextInd = (i + 1) % points.length;
            square += points[i].getX() * points[nextInd].getY() - points[nextInd].getX() * points[i].getY();
        }
        return Math.abs(square) * 0.5;
    }
}
