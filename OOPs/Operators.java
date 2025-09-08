import java.util.*;

class Operators{
    public static void main(String []args){
        int x=10;

        System.out.println("Post increment and Pre increment-->");
        System.out.println("Orignal: "+x);
        System.out.println("Post Increment: "+(x++));
        System.out.println("After post increment: "+x);
        System.out.println("Pre-increment: "+(++x));
        System.out.println("Post-decrement: "+(x--));
        System.out.println("Pre decrement: "+(--x));

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");

        System.out.println("And operator-->");
        int a =12;
        System.out.println("a: "+a);
        int b=10;
        System.out.println("b: "+b);
        int result =a&b;
        System.out.println("a & b: "+ result);

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");
        
    }
}
