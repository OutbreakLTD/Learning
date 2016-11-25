package com.example.helloworld;

/**
 * Created by kmordvickij on 23.11.2016.
 */
public class Circle {
    // свойства класса
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус
    // методы класса
    // выводит на экран параметры окружности
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    // перемещает центр, движение окружности
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    // масштабируем, выполняем преобразование подобия с коэффициентом k
    public void zoomCircle(double k) {
        r = r * k;
    }
    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }
}
