package mypackage;

import movable.MovablePoint;
import movable.MovableCircle;

public class Main {
    public static void main(String[] args) {
        // Тестирование MovablePoint
        System.out.println("Задание 2");
        System.out.println("");

        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println("Initial: " + point);

        point.moveUp();
        System.out.println("After moveUp: " + point);

        point.moveRight();
        System.out.println("After moveRight: " + point);

        // Тестирование MovableCircle
        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 3);
        System.out.println("Initial circle: " + circle);

        circle.moveDown();
        System.out.println("After moveDown: " + circle);

        circle.moveLeft();
        System.out.println("After moveLeft: " + circle);
    }
}