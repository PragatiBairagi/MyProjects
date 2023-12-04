package com.company;

class circle1{
    double radius;
    circle1(double r){
        System.out.println("kya ye run hoga?");
        this.radius = r;
    }
    public double Area(double r){
        System.out.println("The area of circle is: ");
        return 3.14*r*r;
    }
}
class cylinder1 extends circle1{
    double height;
   cylinder1( double h, double r ){
       super(r);
       this.height = h;
   }
    public double Area(double h, double r){
        System.out.println("The area of cylinder is: ");
        return 2*3.14*r*h;
    }
}

public class practice_06 {
    public static void main(String[] args) {
        // Practice problem 1
       circle1 c = new circle1(2);
       cylinder1 cyl = new cylinder1(4,5);
        System.out.println(c.Area(2));
        System.out.println(cyl.Area(4,5));

    }
}
