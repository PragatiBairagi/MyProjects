package com.company;




import java.util.*;























//public class pgms {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a,b,c;
//        System.out.println("enter a");
//        a = sc.nextInt();
//        System.out.println("enter b");
//        b = sc.nextInt();
//        sc.close();
//        try {
//            if(b==0)
//                throw new ArithmeticException("divide by zero");
//            c = a/b;
//            System.out.println("value of"+a+"/"+b+"="+c);
//        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//    }
//}























//class Customer
//{
//    private String name;
//    private String dob;
//
//    void Read_Customer(String n, String d)
//    {
//        name = n;
//        dob = d;
//    }
//
//    void Display_Customer()
//    {
//        StringTokenizer st = new StringTokenizer(dob,"/");
//        System.out.println("Customer details are");
//        System.out.println("Name," + "\t" + "DD, MM, YYYY");
//        System.out.print(name+",\t");
//
//        while(st.hasMoreTokens())
//        {
//            System.out.print(st.nextToken() + ", ");
//        }
//    }
//}
//class pgms {
//    public static void main(String[] args) throws Exception
//    {
//        Scanner sc = new Scanner(System.in);
//        Customer c = new Customer();
//
//        System.out.println("Enter name");
//        String name = sc.next();
//
//        System.out.println("Enter DOB in (DD/MM/YYYY) format only");
//        String dob = sc.next();
//
//        c.Read_Customer(name, dob);
//        c.Display_Customer();
//    }
//}











//import java.util.*;

//class Student1{
//    String usn,name,branch,phone;
//}
//public class pgms {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the no. of students: ");
//        int n = sc.nextInt();
//        Student[] std= new Student[n];
//        for(int i=0;i<n;i++){
//            std[i] = new Student();
//            sc.nextLine();
//            System.out.println("enter the details of student "+(i+1));
//            System.out.println("enter usn");
//            std[i].usn = sc.nextLine();
//            System.out.println("enter name");
//            std[i].name = sc.nextLine();
//            System.out.println("enter branch");
//            std[i].branch = sc.nextLine();
//            System.out.println("enter phone");
//            std[i].phone = sc.nextLine();
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.println("the details of student "+(i+1));
//            System.out.println("usn:"+std[i].usn);
//            System.out.println("name:"+std[i].name);
//            System.out.println("branch:"+std[i].branch);
//            System.out.println("phone:"+std[i].phone);
//
//        }
//
//    }
//}






//
//class StackArray{
//    int max = 3;
//    int top = -1;
//    int arr[] = new int[max];
//
//    void push(int item){
//        if(top==max-1){
//            System.out.println("overflow");
//        }
//        else{
//            top++;
//            arr[top] = item;
//            System.out.println("ushe item: "+arr[top]);
//        }
//    }
//
//    void pop(){
//        if(top==-1){
//            System.out.println("underflow");
//        }
//        else{
//            System.out.println("popped item:"+arr[top--]);
//        }
//    }
//
//    void display(){
//        if(top==-1){
//            System.out.println("empty");
//        }
//        System.out.println("items are:");
//        for (int i=0;i<=top;i++){
//            System.out.println(arr[i]);
//        }
//    }
//}
//
//
//
//public class pgms {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        ArrayStack stack = new ArrayStack();
//        while (true) {
//            System.out.println("enter your choice");
//            System.out.println("1push\n2.pop\n3.display\n4.exit");
//            int ch = sc.nextInt();
//            switch (ch){
//                case 1:
//                    System.out.println("enter the o. to be pushed:");
//                    int item = sc.nextInt();
//                    stack.push(item);
//                    break;
//                case 2:stack.pop();
//                       break;
//                case 3:stack.display();
//                break;
//                case 4:System.exit(0);
//            }
//        }
//    }
//}


//class Staff1{
//    int Id;
//    String Name;
//    String Phone;
//    long Salary;
//
//    public Staff1(int id, String name, String phone, long salary){
//        Id = id;
//        Name = name;
//        Phone = phone;
//        Salary = salary;
//    }
//    public void display(){
//        System.out.println("\t"+Id+"\t\t"+Name+"\t\t"+Phone+"\t\t"+Salary);
//    }
//    class teaching1 extends Staff1 {
//        String Domain;
//        int Publications;
//
//        public teaching1(int id, String name, String phone, long salary, String domain, int publications) {
//            super(id, name, phone, salary);
//            Domain = domain;
//            Publications = publications;
//        }
//
//        public void display() {
//            super.display();
//            System.out.println("\t" + Domain + "\t" + Publications);
//        }
//    }
//        class technical1 extends Staff1 {
//            String Skills;
//
//            public technical1(int id, String name, String phone, long salary, String skills) {
//                super(id, name, phone, salary);
//                Skills = skills;
//            }
//
//            public void display() {
//                super.display();
//                System.out.println("\t" + "--" + "\t" + "--" + Skills + "--" + "\t\t");
//            }
//
//        }
//        class contract1 extends Staff1 {
//           int Period;
//
//            public contract1(int id, String name, String phone, long salary, int period) {
//                super(id, name, phone, salary);
//                Period = period;
//            }
//
//            public void display() {
//                super.display();
//                System.out.println("\t" + "--" + "\t" + "--" + "\t\t" + "--" + "\t\t");
//            }
//    }
//}
//
//public class pgms {
//    public static void main(String args[]){
//        Staff1 s[] = new Staff1[3];
//        s[0] = new teaching1(32,"dfsds");
//    }
//}


























