import java.util.*;
public class star9
{
    public static void main(String[] sm) 
        {
            //triangle star
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
    }
}