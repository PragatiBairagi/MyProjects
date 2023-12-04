package com.company;

public class ch13_break_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            System.out.println("the no.is");
            if (i == 3) {
                System.out.println("loop terminates");
                break;
            }
        }

//*************************************************
        //USING WHILE LOOP
//         int i = 1;
//         while (i <= 5) {
//            System.out.println(i);
//            System.out.println("the no.is");
//
//            if (i == 3){
//                System.out.println("loop terminates");
//                break;
//            }
//                i++;
//        }
//*************************************************
        //USING DO WHILE LOOP
//        int i = 1;
//        do {
//            System.out.println(i);
//            System.out.println("the no.is");
//            if (i == 3){
//                System.out.println("loop terminates");
//                break;
//            }
//            i++;
//        }
//        while (i <= 5);

//*********************************************
        // CONTINUE using FOR loop
        for(int i=0; i<=10; i++) {
            if (i == 3) {
                System.out.println("Ending of loop ");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }

//***********************************************
        // CONTINUE using WHILE loop
//        int i = 0;
//        while(i<=5){
//            i++;
//
//            if(i==3){
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//        }

 //***********************************************
        // CONTINUE using DO WHILE loop
//         int i = 0;
//         do{i++;
//            if(i==3){
//             System.out.println("Ending the loop");
//             continue;
//            }
//             System.out.println(i);
//             System.out.println("Java is great");
//         }
//         while (i<=5);
    }
}
