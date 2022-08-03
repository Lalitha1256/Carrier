package IfCondition;

public class ForLoop {
    public static void main(String[] args) {
        //sum of 10 numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum = sum + i;
        System.out.println(sum);
        //average of 10 numbers
        double average = (double) sum / 10;
        System.out.println("average is:" + average);
        //sum of elements in the array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       // int sum = 0;
        for (int i = 0; i <= a.length - 1; i++)
            sum = sum + a[i];

        System.out.println(sum);
        //snapping of two numbers with third variable
       /* int a=20;
        int b=10;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);*/
        //snapping of two numbers without third variable
       /* int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
*/

    }
}
