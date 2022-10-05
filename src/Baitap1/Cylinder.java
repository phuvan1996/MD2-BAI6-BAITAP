package Baitap1;

import Baitap1.Circle;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVcylinder(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "the tich hinh tru la: "+getVcylinder()+
                "\ncolor="+getColor()+
                "\nheight=" +getHeight();
    }
}
