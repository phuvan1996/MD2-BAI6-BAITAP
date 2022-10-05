package Baitap1;

import Baitap1.Circle;
import Baitap1.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------CIRCLE-------");
        Circle circle = new Circle(3.5,"red");
        System.out.println(circle);

        System.out.println("------CYLINDER------");
        Cylinder cylinder = new Cylinder(2.5,"green",3.5);
        System.out.println(cylinder);
    }
}