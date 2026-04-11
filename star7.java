import java.util.*;
public class star7 
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {                 
            for(int j=0;j<s-i-1;j++)
            {
                System.out.print("  ");
            }
            for(int k=s-i;k<=s;k++)
            {
                System.out.print(" "+k);
            }
            System.out.println();
        }
        sc.close();
    }
}
