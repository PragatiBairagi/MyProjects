package com.company;

import java.util.Scanner;

public class practice_04_patttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // RECTANGLE
//        System.out.println("no. of rows : ");
//        int row = sc.nextInt();
//        System.out.println("no. of columns : ");
//        int column = sc.nextInt();
//        for(int i=1; i<=row; i++){
//           for (int j=1; j<=column; j++) {
//               System.out.print("*");
//           }
//                System.out.println();
//        }

//***********************************************
        //HOLLOW RECTANGLE
//        System.out.println("no. of rows : ");
//        int row = sc.nextInt();
//        System.out.println("no. of columns : ");
//        int column = sc.nextInt();
//        for(int i=1; i<=row; i++){
//            for (int j=1; j<=column; j++) {
//                if (i == 1 || i == row || j == 1 || j == column) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//***********************************************
        // HALF PYRAMID
//        System.out.println("value of n is : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//***********************************************
        // INVERTED HALF PYRAMID
//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        for(int i=n; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//***********************************************
// INVERTED HALF PYRAMID rotated by 180
//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n-i ; j++) {
//                System.out.print(" ");
//            }
//           for (int j=1; j<=i; j++){
//               System.out.print("*");
//               }
//            System.out.println();
//            }

//***********************************************
//  HALF PYRAMID with numbers
//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //***********************************************
        // INVERTED HALF PYRAMID with numbers
//                System.out.println("value of n is : ");
//                int n = sc.nextInt();
//                for(int i=n; i>=1; i--) {
//                    for(int j=1; j<=i; j++) {
//                         System.out.print(j+" ");
//                    }
//                    System.out.println();
//                }


        //***********************************************
        // FLOYD's TRIANGLE
//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        int number = 1;
//        for (int i = 1; i<=n; i++) {
//            for (int j =1 ; j<=i ; j++)
//               {
//                System.out.print(number+" ");
//                number++;
//
//                 }
//            System.out.println();
//           }

//***********************************************
        //01 TRIANGLE

//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        int number = 1;
//        for(int i=1; i<=n; i++) {
//            for (int j = 1; j <= i; j++) {
//                int sum = i + j;
//                if (sum % 2==0) {
//                    System.out.print("1");
//                } else  {
//                    System.out.print("0");
//                        }
//                    }
//            System.out.println();
//                }

//***********************************************
        //Number pyramid
//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(i);
//                System.out.print(" ");
//                  }
//
//            System.out.println();
//              }

//***********************************************


//***********************************************
        //Butterfly structure
//        System.out.println("value of n is : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces= 2*(n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//        for(int i=n; i>=1; i--){                   // reverse pattern
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            int spaces= 2*(n-i);
//            for(int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//*************************************************************************
        //Solid rhombus
//        System.out.println("value of n is : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+" ");
//           }
//             System.out.println();
//         }


//*************************************************************************
//    Palindromic(same from both ends) Number pyramid Pattern

//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n;i++) {
//            for (int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//            for(int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//*************************************************************************
//    Palindromic(same from both ends) Number pyramid Pattern

//        System.out.println("value of n is : ");
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=i; j>=1; j--){
//                System.out.print("*");
//            }
//            for(int j=2; j<=i; j++){
//                System.out.print("*");
        // another way
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1; i>=1; i--){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


       for (int i = 1; i<=3;i++){
           for (int j = 1; j<=3;j++){
               for (int k = 1; k<=3;k++){
                   System.out.print(k);
               }
               System.out.print(" "+j);
           }
           System.out.print(" "+i);
       }
    }

}
