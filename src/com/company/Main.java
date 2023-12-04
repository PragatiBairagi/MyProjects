package com.company;
class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails() {
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 prag = new Employee1();
        Employee1 harry = new Employee1();

     // setting attributes for pragati
        prag.id = 12;
        prag.salary = 5000;
        prag.name = "Pragati Bairagi";

     // setting attributes for harry
        harry.id = 12;
        harry.salary = 3000;
        harry.name = "CodeWithHarry";

     // printing the attributes
        prag.printDetails();
     // int salary = prag.getSalary();

        harry.printDetails();
        int salary = harry.getSalary();


//      System.out.println(prag.id);
//      System.out.println(prag.name);


    }
}
