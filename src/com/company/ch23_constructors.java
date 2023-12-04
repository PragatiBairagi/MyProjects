package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 0;
        name = "your-name-here" +
                "";
    }
    public MyMainEmployee(String myName , int myId) {
        id = myId;
        name = myName;
    }
    public String getName(){

        return name;
    }
    public void setName(String n){

        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}
public class ch23_constructors {
    public static void main(String[] args) {
        MyMainEmployee prag = new MyMainEmployee("Pragati Bairagi",5);
//      prag.setName("Pragati  Bairagi");
//      prag.setId(55);
        System.out.println(prag.getName());
        System.out.println(prag.getId());
    }
}
