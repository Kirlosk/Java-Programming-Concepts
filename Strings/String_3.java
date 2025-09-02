import java.util.*;

class String_3{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        int size=0;

        size =name.length();


        System.out.println("The length of the string is: "+size);

        
    }
}