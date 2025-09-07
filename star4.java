import java.util.Scanner;
public class star4 
    {
    public static void main(String[] sm)
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {                 
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");  
            }  
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");                                
            } 
            System.out.println();
        }
    }
}