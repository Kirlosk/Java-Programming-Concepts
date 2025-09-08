import java.util.*;

class Operators{
    public static void main(String []args){
        int x=10;

        System.out.println("Orignal: "+x);
        System.out.println("Post Increment: "+(x++));
        System.out.println("After post increment: "+x);
        System.out.println("Pre-increment: "+(++x));
        System.out.println("Post-decrement: "+(x--));
        System.out.println("Pre decrement: "+(--x));

        System.out.println("------------------------------------");

        int a =12;
        int b=10;
        int result =a&b;
        System.out.println("a & b: "+ result);
    }
}
