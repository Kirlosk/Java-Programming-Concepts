import java.util.*;

class Sofa{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the bedroom: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        Char space[][]=new Character[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                space[i][j]=sc.nextChar();
            }
        }
        System.out.println(Arrays.deepToString(space));

    }

}