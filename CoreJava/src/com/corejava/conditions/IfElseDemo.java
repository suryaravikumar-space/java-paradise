package com.corejava.conditions;

public class IfElseDemo {
    static void voterAge(){
        int age = 18;
        int userInput = 17;
        if(age<=userInput){
            System.out.println("allow");
        }else {
            System.out.println("not allow");
        }
    }
    public static void main(String[] args) {
        voterAge();
    }
}
