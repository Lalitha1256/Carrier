package WrapperClass;

public class WrapperClasses {
    public static void main(String[] args) {
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println(a+" "+i+" "+j);//autoboxing
        Integer b=new Integer(3);
        int k=b;
        System.out.println(k);//unboxing
        //string to int
        String x="100";
        System.out.println(x+20);
       //int i=Integer.parseInt(x);
        //
        // System.out.println(i);
        //int to string
        int y=100;
        String value=String.valueOf(y);
        System.out.println(value);

    }
}
