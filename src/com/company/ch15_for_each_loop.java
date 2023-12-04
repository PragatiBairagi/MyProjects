package com.company;

public class ch15_for_each_loop {
    public static void main(String[] args) {
//        String[] names = {"Pragati", "Neha", "Ratnesh", "Basant", "Manorma"};
//        System.out.println(names.length);                       // number of elements
//        System.out.println(names[2]);
//        float[] marks = {90.5f,98.75f,96.5f,94, 89};
        int[] marks = {90,98,96,94, 89};

        System.out.println(marks.length);
        // Displaying the array (for loop)
//        for(int i=0; i< marks.length; i++){
//            System.out.println(marks[i]);
//        }

//quick quiz: reverse order
        for(int i=marks.length-1; i>=0 ; i--){
            System.out.println(marks[i]);
        }
//quick quiz: displaying the array for each loop
        System.out.println("Printing using for loop ");
        for(int element: marks ){
            System.out.println(element);
        }
    }

}
