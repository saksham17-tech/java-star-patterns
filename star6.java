import java.util.Scanner;

public class star6
 {
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {                 
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print("1 ");
                if((i+j)%2!=0)
                System.out.print("0 ");                
            }
            System.out.println();
        }
    }
}