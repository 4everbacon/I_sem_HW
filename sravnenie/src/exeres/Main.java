package exeres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x1, y1, x2, y2, a1, b1, a2, b2;
        System.out.println("Запишите координаты первого треугольника:");
        System.out.println("x1:");
        x1 = sca.nextInt();
        System.out.println("y1:");
        y1 = sca.nextInt();
        System.out.println("x2:");
        x2 = sca.nextInt();
        System.out.println("y2:");
        y2 = sca.nextInt();
        System.out.println("Запишите координаты второго треугольника:");
        System.out.println("a1:");
        a1 = sca.nextInt();
        System.out.println("b1:");
        b1 = sca.nextInt();
        System.out.println("a2:");
        a2 = sca.nextInt();
        System.out.println("b2:");
        b2 = sca.nextInt();
        if (x2<a1 || x1>a2 || y1<b2 || y2>b1)
        {
            System.out.println("Квадраты не пересекаются");
        } else
        {
            System.out.println("Квадраты пересекаются");
        }

    }
}
