package Baitap4;

public class Main {
    public static void main(String[] args) {
        System.out.println("CHU VI VÀ DIỆN TÍCH TAM GIÁC");
        Triangle triangle = new Triangle(14,24,23);
        System.out.println(triangle);

        System.out.println("-----MÀU SẮC CỦA TAM GIAC-----");
        Shape shape = new Shape("green");
        System.out.println(shape);
    }
}
