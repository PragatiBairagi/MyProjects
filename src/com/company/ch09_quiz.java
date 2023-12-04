package com.company;

import java.util.Random;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        radius = 0;
        height = 0;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }


    //    public void setRadius(int radius) {
//        this.radius = radius;
//    }
    public int getHeight() {
        return height;
    }

    //    public void setHeight(int height) {
//        this.height = height;
//    }
    public double SurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
    class Rectangle2 {
        private int length;
        private int breadth;

        public Rectangle2(){
         this.length = 4;
         this.breadth = 5;
        }
        public Rectangle2(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        public int getLength() {
            return length;
        }
        public int getBreadth() {
            return breadth;
        }
    }

public class ch09_quiz {
    public static void main(String[] args) {
        /*
        Cylinder cyl = new Cylinder();
        //Practice Problem 1
        cyl.setHeight(4);
        cyl.setRadius(3);
        //Practice Problem 2
        System.out.println("The surface area of cylinder is : "+cyl.SurfaceArea());
        System.out.println("The volume of cylinder is : "+cyl.volume());
      */

       /* //Practice Problem 3
        Cylinder cyl = new Cylinder(4,5);
        System.out.println("radius-: "+cyl.getRadius());
        System.out.println("height-: "+cyl.getHeight());
        System.out.println("The surface area of cylinder is : "+cyl.SurfaceArea());
        System.out.println("The volume of cylinder is : "+cyl.volume());
         */

        //Practice Problem 3
        Rectangle2 r = new Rectangle2(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}


