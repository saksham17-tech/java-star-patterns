import java.util.*;
class star14
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        for(int i=1;i<=s;i++)
        {                 
            for(int j=1;j<=s-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();            
        }
        for(int i=1;i<s;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int k=s-i;k>=1;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}