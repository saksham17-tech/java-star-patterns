import java.util.*;
class star16
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        for(int i=0;i<s;i++)
        {                 
            for(int j=s-i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=s;i++)
        {                 
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}