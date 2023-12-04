package com.company;


//import java.util.*;
//
//class square extends Thread{
//    int x;
//    square(int n){
//        x = n;
//    }
//    public void run(){
//        int sqr = x*x;
//        System.out.println("sqr of"+x+"="+sqr);
//    }
//
//}
//
//class cube extends Thread{
//    int x;
//    cube(int n){
//        x = n;
//    }
//    public void run(){
//        int cub = x*x*x;
//        System.out.println("sqr of"+x+"="+cub);
//    }
//
//}
//
//class number extends Thread{
//
//    public void run(){
//       Random random = new Random();
//       for (int i=0;i<10;i++){
//          int randomInteger = random.nextInt(100);
//           System.out.println("generated as:"+randomInteger);
//           square s = new square(randomInteger) ;
//           s.start();
//           cube c = new cube(randomInteger) ;
//           c.start();
//
//           try {
//               Thread.sleep(1000);
//           }
//           catch (InterruptedException ex){
//               System.out.println(ex);
//           }
//       }
//    }
//
//}
//
//public class LabInternal {
//    public static void main(String args){
//        number n = new number();
//        n.start();
//    }
//}
























//
//class square extends Thread{
//    int x;
//
//    square(int n){
//            x = n;
//        }
//    public void run(){
//        int sqr = x*x;
//        System.out.println("square of "+x+"="+sqr);
//    }
//}
//
//class cube extends Thread{
//    int x;
//
//    cube(int n){
//        x = n;
//    }
//    public void run(){
//        int cub = x*x*x;
//        System.out.println("the cube if "+x+"="+cub);
//    }
//}
//
//class number extends Thread{
//    public void run(){
//        Random random = new Random();
//        for(int i=0;i<10;i++){
//            int randInteger = random.nextInt(100);
//            System.out.println("random no. generated is:"+randInteger);
//            square s = new square(randInteger);
//            s.start();
//            cube c = new cube(randInteger);
//            c.start();
//
//            try{
//               Thread.sleep(1000);
//            }
//            catch(InterruptedException ex){
//                System.out.println(ex);
//            }
//        }
//    }
//}
//
//
//public class LabInternal{
//    public static void main(String args[]){
//        number n = new number();
//        n.start();
//    }
//}
//
//










//
import java.util.*;

class Square1 extends Thread{
    int x;
    Square1(int n){
        x = n;
    }
    public void run(){
        int sqr = x*x;
        System.out.println("square of "+x+"is "+sqr);
    }
}

class Cube extends Thread{
    int x;
    Cube(int n){
        x = n;
    }
    public void run(){
        int cub = x*x*x;
        System.out.println("square of "+x+"is "+cub);
    }
}

class Number extends Thread{
    public void run(){
        Random ran = new Random();
        for(int i=0;i<10;i++){
        int IntNum = ran.nextInt(100);
        System.out.println("random no. generated is :"+IntNum);
        Square1 s = new Square1(IntNum);
        s.start();
        Cube c = new Cube(IntNum);
        c.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
            System.out.println(ex);
        }
        }
    }
}

public class LabInternal {
    public static void main(String args[]){
        Number n = new Number();
        n.start();
    }
}

//
//
//
//
//
//
//
//
//
//
//
//
//
//public class LabInternal {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a,b,c;
//        System.out.println("enter the integers: ");
//        System.out.println("enter A: ");
//        a = sc.nextInt();
//        System.out.println("enter B: ");
//        b = sc.nextInt();
//        try {
//            if(b==0)
//            throw new ArithmeticException("divided by zero");
//            c = a/b;
//            System.out.println("value of "+a+" / "+b+" is "+c);
//        }
//        catch(ArithmeticException e){
//            e.printStackTrace();
//        }
//    }
//}
//
//

//
//
//
//
//class StackArray{
//    int max = 3;
//    int top = -1;
//    int arr[] = new int[max];
//
//    void push(int item){
//        if(top==max-1){
//            System.out.println("overflow\n");
//        }
//        else {
//            top++;
//            arr[top] = item;
//            System.out.println("added item is : "+arr[top]);
//        }
//    }
//
//    void pop(){
//        if(top==-1){
//            System.out.println("underflow\n");
//        }
//        else{
//            System.out.println("the popped item is: "+arr[top--]);
//        }
//    }
//
//    void display(){
//        if(top==-1){
//            System.out.println("empty array\n");
//        }
//        else{
//            System.out.println("items are: ");
//            for(int i=0;i<=top;i++){
//                System.out.println(arr[i]);
//            }
//        }
//    }
//}
//
//public class LabInternal{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        StackArray stack = new StackArray();
//        while(true) {
//            System.out.println("enter your choice\n");
//            System.out.println("\n1.push\n2.pop\n3.display\n4.exit\n");
//            int ch = sc.nextInt();
//            switch (ch){
//                case 1:
//                    System.out.println("ENTER THE ITEM TO BE ADDED: ");
//                    int item = sc.nextInt();
//                    stack.push(item);
//                    break;
//                case 2:
//                    stack.pop();
//                    break;
//                case 3:
//                    stack.display();
//                    break;
//                case 4: System.exit(0);
//                default:
//                    System.out.println("enter correct choice\n");
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//class Student1{
//    String usn;
//    String name;
//    String branch;
//    String phone;
//}
//
//public class LabInternal {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of students:\n");
//        int n = sc.nextInt();
//        Student1[] std = new Student1[n];
//        for(int i = 0;i<n;i++){
//            std[i] = new Student1();
//            sc.nextLine();
//            System.out.println("enter the details of student "+(i+1));
//            System.out.println("enter usn\n");
//            std[i].usn = sc.nextLine();
//            System.out.println("enter name\n");
//            std[i].name = sc.nextLine();
//            System.out.println("enter branch\n");
//            std[i].branch = sc.nextLine();
//            System.out.println("enter phone no.\n");
//            std[i].phone = sc.nextLine();
//        }
//
//        for(int j=0;j<n;j++){
//            System.out.println("the details of student "+(j+1)+" i\n");
//            System.out.println("USN = "+std[j].usn+"\n"+"NAME = "+std[j].name+"\n"+"BRANCH = "+std[j].branch+"\n"+"PHONE = "+std[j].phone+"\n");
//        }
//          sc.close();
//    }
//
//}
//
