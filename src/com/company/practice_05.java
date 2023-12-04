package com.company;

public class practice_05 {
    public static void main(String[] args) {
        // practice problem 1
//        int []marks;
//        int sum = 0;
//         marks = new int[5];
//         marks[0]= 35;
//         marks[1]= 31;
//         marks[2]= 33;
//         marks[3]= 37;
//         marks[4]= 30;
//         for(int element:marks){
//            sum = sum + element;
//        }
//        System.out.println(sum);

//        for(int i=0; i<tin.length; i++){
//            System.out.print(tin[i]+"\n");
//        }
//        System.out.println();

//practice problem 2
//        int [] marks= {35,31 ,33 ,37 ,30};
//        int num = 35;
//        boolean isInArray = false;
//        for(int element:marks){
//            if(num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is in array");
//        }
//        else{
//            System.out.println("The value is not in array");
//        }

//  practice problem 3
//           float[] marks = {98,87,88,56,44} ;
//           float sum=0;
//           for (float element:marks) {
//            sum = sum + element;
//               }
//            System.out.println("The value of avg marks is "+sum/marks.length);

//  practice problem 4
//        int [][] matrix1= { {1,2,3},
//                        {4,5,6}  };
//        int [][] matrix2= { {1,3,5},
//                        {2,4,6}  };
//        int [][] result= { {0,0,0},
//                        {0,0,0}  };
//
//        for(int i=0;i< matrix1.length; i++) {    //row no. of times
//             for(int j=0; j< matrix1[i].length; j++) {    //column no. of times
//                 System.out.format("Setting value for i=%d and j=%d \n", i, j);
//                 result[i][j] = matrix1[i][j] + matrix2[i][j];
//                                       }
//                           }
//        for(int i=0;i< matrix1.length; i++) {    //row no. of times
//            for(int j=0; j< matrix1[i].length; j++) {    //column no. of times
//                System.out.print(result[i][j]+" ");
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//            System.out.println("  ");
//        }

//  practice problem 5 (REVERSING AN ARRAY)
//           int[] marks = {98,87,88,56,44} ;
//           int l = marks.length;
//           int n = Math.floorDiv(l,2);
//           int temp;
//
//           for (int i=0; i<n; i++) {
//               //swap a[i] & a[l-i-1]
//               // a  b  temp
//               //|4| |3| | |
//               temp = marks[i];
//               marks[i] = marks[l-i-1];
//               marks[l-i-1] = temp;
//           }
//           for(int element:marks){
//               System.out.print(element+ " ");
//        }

//Practice problem 6
//         int [] marks = {23,33,35,30,29};
//         int max = 0;
//         for (int element:marks) {
//             if(element>max) {
//                 max= element;
//             }
//        }
//        System.out.println("The value of the maximum array is: "+max);


//Practice problem 7
//        int [] marks = {23,33,35,30,29};
//        int min = Integer.MAX_VALUE;
//        for(int element:marks){
//            if(element<min){
//                min=element;
//            }
//        }
//        System.out.println("The value of the minimum array is: "+min);

//Practice problem 8
        int [] marks = {2,3,5,30,249};
        boolean isSorted = true;
        for(int i=0; i< marks.length-1; i++){
            if(marks[i]>marks[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}
