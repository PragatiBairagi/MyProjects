package com.company;

import java.util.jar.JarEntry;

class Employee2 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
 class cellPhone {
        public void ring() {
            System.out.println("Ringing...");
        }

        public void vibrate() {
            System.out.println("vibrating...");
        }

        public void callFriend() {
            System.out.println("Calling ratnesh");
        }

    }
  class Square {
        int side;
        public int Area() {
        return side * side;
    }

    public int Parameter() {
        return 4*side;
    }
}
class Rectangle {
    int length;
    int breadth;
    public int Area() {
        return length * breadth;
    }

    public int Parameter() {
        return 2*(length+breadth);
    }
}
class Circle {
    float radius;
    public float Area() {
        return (3.14f*radius*radius);
    }

    public float Parameter() {
        return 2*3.14f*radius;
    }
}
class TommyVercetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firring on the enemy");
    }
}


    public class ch8_PracticeSet {
        public static void main(String[] args) {
          /*
            //Problem 1
            Employee2 prag = new Employee2();
            prag.setName("Pragati Bairagi");
            prag.salary = 5000;
            System.out.println(prag.getName());
            System.out.println(prag.getSalary());


            //Problem 2
            cellPhone asus = new cellPhone();
            asus.callFriend();
            asus.vibrate();
            asus.ring();
           */

            /*
           //Problem 3
            Square sq = new Square();
            sq.side = 5;
            System.out.println("The area of sq  is : "+sq.Area());
            System.out.println("The parameter of sq  is : "+sq.Parameter());

            //Problem 4
            Rectangle rec = new Rectangle();
            rec.length = 5;
            rec.breadth = 2;
            System.out.println("The area of rectangle is : "+rec.Area());
            System.out.println("The parameter of rectangle is : "+rec.Parameter());

            //Problem 5
            Circle crcl = new Circle();
            crcl.radius = 3;
            System.out.println("The area of circle is : "+crcl.Area());
            System.out.println("The parameter of circle is : "+crcl.Parameter());
             */

            //Problem 6
            TommyVercetti player1 = new TommyVercetti();
            player1.hit();
            player1.run();
            player1.fire();


        }
    }