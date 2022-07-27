package Methods;

import MethodwithReturnType.MethodsDatatype;

public class MethodWithreturnType {
    public int add(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;


    }

    public String name() {
        return null;


    }

    public static void main(String[] args) {
        MethodsDatatype obj=new MethodsDatatype();

        int output= obj.add();
        String name=obj.name();
        System.out.println(name);
        System.out.println("output");
        boolean flag=MethodsDatatype.displayed();
        obj.add();
    }
}
