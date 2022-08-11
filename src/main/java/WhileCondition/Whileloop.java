package WhileCondition;

public class Whileloop {
    public static void main(String[] args) {
        //sum of 10 numbers using while loop
        /*int i=0;
        int sum=0;
        while (i<=10) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        */
        //reverse digit of a number(palindrome)
        /*int no = 987654;
        int reverse = 0;
        int remainder = 0;
        while (no != 0) {
            remainder = no % 10;
            reverse = reverse * 10 + remainder;
            no = no / 10;
        }
                System.out.println(reverse);
        */
    //do while
       /* int i=1;
        int sum=0;
        do {
            sum=sum+i;
            i++;
        }
        while (i<=10);
        System.out.println(sum);*/
        String browser="chrome";
        switch (browser){
            case "chrome":System.out.println("working on chrome browser");break;
            case "IE":System.out.println("working on ie browser");break;
            case "edge":System.out.println("working on edge browser");break;
            default:
                System.out.println("chrome browser");
        }
    }
        }




