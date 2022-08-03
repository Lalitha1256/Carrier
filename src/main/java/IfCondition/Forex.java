package IfCondition;

public class Forex {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        String[] name={"lalitha","sri","srinivas"};
        for (int i=0;i<=name.length-1;i++){
            if (name[i].equals("lalitha")){
                System.out.println("lalitha is available");
                break;
            }
        }

    }
}

