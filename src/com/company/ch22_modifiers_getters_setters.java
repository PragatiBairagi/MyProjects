package com.company;

class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class ch22_modifiers_getters_setters {
    public static void main(String[] args) {
        MyEmployee prag = new MyEmployee();
        //prag.id = 5;
        //prag.name = "Pragati Bairagi";  ----> throws an error due to private access modifier
        prag.setName("Pragati Bairagi");
        System.out.println(prag.getName());
        prag.setId(5);
        System.out.println(prag.getId());
        System.out.println();
    }
}


