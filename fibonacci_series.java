import java.util.Scanner;
public class fibonacci_series {
    public static void main(String args[]){
        System.out.println("enter num ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i,j=1,k=1;
        System.out.println(j);
        System.out.println(k);
        for(i=2;i<a;i++)
        {
            k=k+j;
            j=k-j;
            System.out.println(k);
        }
        s.close();
    }
}
