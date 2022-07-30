package OOPSconcept;

public class Childclass extends Baseclass{
    public void sub(int a,int b,int c){
        int addoutput=super.add(10,20);
        int d=addoutput-c;
        System.out.println(c);
    }
}
