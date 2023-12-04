package com.company;

import java.util.Scanner;

public class practice_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Physics marks");
//        int phy = sc.nextInt();
//
//        System.out.println("Enter your Chemistry marks");
//        int chem = sc.nextInt();
//
//        System.out.println("Enter your Maths marks");
//        int maths = sc.nextInt();
//
//        float tprcnt = (phy+chem+maths)/3.0f;
//        if(phy>=33 && chem>=33 && maths>=33 && tprcnt>=40){
//            System.out.println("your percentage is:\t "+tprcnt+"% \n congratulations!\n  You are pass");
//        }
//        else{
//            System.out.println("your percentage is:\t "+tprcnt+"% \nsorry You are not pass");
//        }

//****************************************************************
        //INCOME TAX
//        System.out.println("Enter your annual income in lakh");
//        float income = sc.nextFloat();
//        float tax = 0f;
//        if(income<2.5f) {
//            tax = tax + 0f;
//            System.out.println("you are under EWS category");
//        }
//        else if(2.5f<=income && income <5.0f) {
//           tax = tax + 0.05f*(income-2.5f);
//        }
//        else if(5.0f <=income && income <10.0f){
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax + 0.2f*(income-5.0f);
//        }
//        else if(income>=10f) {
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax + 0.2f*(10.0f-5.0f);
//            tax = tax + 0.3f*(income-10.0f);
//        }

//        System.out.println("The total tax paid by the employ is : "+tax);

//*********************************************
        //DAY OF THE WEEK
//        int num = sc.nextInt();
//        if(num==1) {
//            System.out.println("its Monday");
//        }
//        else if(num==2) {
//            System.out.println("its Tuesday");
//        }
//        else if(num==3) {
//            System.out.println("its Wednesday");
//        }
//        else if(num==4) {
//            System.out.println("its Thursday");
//        }
//        else if(num==5) {
//            System.out.println("its Friday");
//        }
//        else if(num==6) {
//            System.out.println("its Saturday");
//        }
//        else if(num==7) {
//            System.out.println("its Sunday");
//       }

        // USING enhance SWITCH STATEMENT:
//        int num = sc.nextInt();
//       switch (num) {
//           case 1 -> System.out.println("its Monday");   // "->" sign will use in place of break
//           case 2 -> System.out.println("its Tuesday");
//           case 3 -> System.out.println("its Wednesday");
//           case 4 -> System.out.println("its Thursday");
//           case 5 -> System.out.println("its Friday");
//           case 6 -> System.out.println("its Saturday");
//           case 7 -> System.out.println("its  Sunday");
//           default -> System.out.println("please enter a valid number!");
//       }

//********************************************************
        // LEAP YEAR
//        System.out.println("Enter the year ");
//        int year = sc.nextInt();
//
//        if(year>=1000 && year%4==0 ) {
//            System.out.println("This is  a leap year");
//        }
//        else if(year<1000  && year%400==0){
//            System.out.println("This is  a leap year");
//        }
//        else System.out.println("This is not a leap year");

        //**************************************************************
        //COMMERCIAL  SITES
        System.out.println("Enter the URL");
        String sites = sc.next();
        if(sites.endsWith(".com")){
            System.out.println("Its a commercial site");
        }
       else if(sites.endsWith(".org")){
            System.out.println("Its an organisation website ");
        }
        else if(sites.endsWith(".in")){
            System.out.println("Its an Indian website ");
        }
        else {
            System.out.println("invalid site");
        }


    }
}
