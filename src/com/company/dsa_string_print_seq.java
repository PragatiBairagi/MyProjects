package com.company;

import java.util.Scanner;

public class dsa_string_print_seq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        printKPS(str,"");
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPS(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String codeforch = codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char cho = codeforch.charAt(i);
            printKPS(roq,ans+cho);
        }
    }
}
