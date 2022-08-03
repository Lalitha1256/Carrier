package IfCondition;

public class IfElseCondition {
    public static void main(String[] args) {
        int marks = 64;
        String name="lalitha";
        if (marks < 35) {
            System.out.println("fail");
            System.out.println(name);
        } else if (marks >= 60 && marks <= 100) {
            System.out.println("first class");
            if (name.equals("lalitha"))
                System.out.println("good");
            else {
                System.out.println("improved");
            }
        } else if (marks >= 45 && marks <= 59) {
            System.out.println("second class");
        } else if (marks >= 35 && marks <= 44) {
            System.out.println("third class");
        }
    }
}