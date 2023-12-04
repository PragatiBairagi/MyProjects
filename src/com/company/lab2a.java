package com.company;

class Staff
{
     int StaffId;
     String Name;
     String Phone;
     long Salary;
    public Staff(int staffid,String name,String phone,long salary)
    {
        StaffId = staffid;
        Name = name;
        Phone = phone;
        Salary = salary;
    }
    public void Display()
    {
        System.out.print("\t"+StaffId+"\t"+Name+"\t\t"+Phone+"\t\t"+Salary);
    }
}

class Teaching extends Staff
{
     String Domain;
     int Publications;
    public Teaching(int staffid, String name, String phone,long salary, String domain, int publications)
    {
        super(staffid, name, phone, salary);
        Domain = domain;
        Publications = publications;
    }
    public void Display()
    {
        super.Display();
        System.out.print("\t\t"+Domain+"\t\t"+Publications+"\t\t"+"--"+"\t"+"--");
    }
}

class Technical extends Staff
{
     String Skills;
    public Technical(int staffid, String name, String phone,long salary, String skills)
    {
        super(staffid, name, phone, salary);
        Skills = skills;
    }
    public void Display()
    {
        super.Display();
        System.out.print("\t\t--"+"\t\t"+"--"+"\t"+Skills+"\t\t"+"--");
    }
}

class Contract extends Staff
{
     int Period;
    public Contract(int staffid, String name, String phone, long salary, int period)
    {
        super(staffid, name, phone, salary);
        this.Period = period;
    }
    public void Display()
    {
        super.Display();
        System.out.print("\t\t--"+"\t\t"+"--"+"\t\t"+"--"+"\t\t"+Period);
    }
}

public class lab2a {
    public static void main(String args[]){
        Staff s[] = new Staff[3];
        s[0] = new Teaching(32,"dfsds","21312",3213,"sdsa",213);
        s[1] = new Teaching(33,"dfsds","21312",3213,"sdsa",213);
        s[2] = new Teaching(34,"dfsds","21312",3213,"sdsa",213);
        System.out.println("StaffID\tName\t\tPhone\t\tSalary\t\tDomain\t\tPublication\tSkills\tPeriod");
        for (int i=0;i<3;i++){
            s[i].Display();
            System.out.println();
        }
    }
}




















//class Staff{
//    private int StaffId;
//    private String Name;
//    private String Phone;
//    private long Salary;
//
//
//    public Staff(int staffId,String name,String phone,long salary){
//
//        StaffId = staffId;
//        Name = name;
//        Phone = phone;
//        Salary = salary;
//    }
//
//    public void Display(){
//        System.out.print("\t"+StaffId+"\t"+Name+"\t\t"+Phone+"\t\t"+Salary);
//    }
//}
//
//class Teaching extends Staff{
//    private String Domain;
//    private int Publications;
//
//    public Teaching(int staffId,String name,String phone,long salary,String domain,int publications){
//        super(staffId,name,phone,salary);
//        Domain = domain;
//        Publications = publications;
//    }
//
//    public void Display(){
//        super.Display();
//        System.out.print("\t\t"+Domain+"\t\t"+Publications+"\t\t"+"__"+"\t\t"+"__");
//    }
// }
//
//class Technical extends Staff{
//    private String Skills;
//
//    public Technical(int staffId,String name,String phone,long salary,String skills){
//        super(staffId,name,phone,salary);
//        Skills = skills;
//    }
//
//    public void Display(){
//        super.Display();
//        System.out.print("\t\t"+"__"+"\t\t"+"__"+"\t"+Skills+"\t"+"__");
//    }
//}
//
//class Contract extends Staff{
//    private int Period;
//
//    public Contract(int staffId,String name,String phone,long salary,int period){
//        super(staffId,name,phone,salary);
//       this.Period = period;
//    }
//
//    public void Display(){
//        super.Display();
//        System.out.print("\t\t"+"__"+"\t\t"+"__"+"\t\t"+"__"+"\t\t"+Period);
//    }
//}
//
//public class lab2a {
//    public static void main(String args[]){
//     Staff staff[] = new Staff[3];
//     staff[0] = new Teaching(0001,"PRAG","271173",900005,"CSE",3);
//     staff[1] = new Teaching(0002,"TANI","271173",900011,"CSE",3);
//     staff[2] = new Teaching(0003,"SWAT","271173",900003,"CSE",3);
//        System.out.println("StaffID\tName\t\tPhone\t\tSalary\t\tDomain\t\tPublication\tSkills\tPeriod");
//        for(int i = 0;i<3;i++){
//            staff[i].Display();
//            System.out.println();
//        }
//    }
//}

//
//import java.util.*;
//
//class Staff
//{
//     int StaffId;
//     String Name;
//     String Phone;
//     long Salary;
//    public Staff(int staffid,String name,String phone,long salary)
//    {
//        StaffId = staffid;
//        Name = name;
//        Phone = phone;
//        Salary = salary;
//    }
//    public void Display()
//    {
//        System.out.print("\t"+StaffId+"\t"+Name+"\t\t"+Phone+"\t\t"+Salary);
//    }
//}
//
//class Teaching extends Staff
//{
//     String Domain;
//     int Publications;
//    public Teaching(int staffid, String name, String phone,long salary, String domain, int publications)
//    {
//        super(staffid, name, phone, salary);
//        Domain = domain;
//        Publications = publications;
//    }
//    public void Display()
//    {
//        super.Display();
//        System.out.print("\t\t"+Domain+"\t\t"+Publications+"\t\t"+"--"+"\t"+"--");
//    }
//}
//
//class Technical extends Staff
//{
//     String Skills;
//    public Technical(int staffid, String name, String phone,long salary, String skills)
//    {
//        super(staffid, name, phone, salary);
//        Skills = skills;
//    }
//    public void Display()
//    {
//        super.Display();
//        System.out.print("\t\t--"+"\t\t"+"--"+"\t"+Skills+"\t\t"+"--");
//    }
//}
//
//class Contract extends Staff
//{
//     int Period;
//    public Contract(int staffid, String name, String phone, long salary, int period)
//    {
//        super(staffid, name, phone, salary);
//        this.Period = period;
//    }
//    public void Display()
//    {
//        super.Display();
//        System.out.print("\t\t--"+"\t\t"+"--"+"\t\t"+"--"+"\t\t"+Period);
//    }
//}
//
//public class lab2a
//{
//    public static void main(String[] args)
//    {
//        Staff staff[]=new Staff[3];
//        staff[0]=new Teaching(0001,"DURGA","271173",90000,"CSE",3);
//        staff[1]=new Technical(0002,"EASHA","271172",2000,"Server Admin");
//        staff[2]=new Contract(0003,"MUTTU","271174",9000,3);
//        System.out.println("StaffID\tName\t\tPhone\t\tSalary\t\tDomain\tPublication\tSkills\t\tPeriod");
//        for(int i=0;i<3;i++)
//        {
//            staff[i].Display();
//            System.out.println();
//        }
//    }
//}