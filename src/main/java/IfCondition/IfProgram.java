package IfCondition;

public class IfProgram {
    public static void main(String[] args) {
        int marks;
        int m =61;
        System.out.println("enter the marks:");
        if (m>35 && m<44)
            System.out.println("3 rd division");
        if (m>45 && m<59)
            System.out.println("2 nd division");
        if (m>60 && m<=100)
            System.out.println("1 st division");
        if (m<35)
            System.out.println("fail");
    }

}
