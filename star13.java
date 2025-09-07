import java.util.*;
class star13
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        for(int i=0;i<s+1;i++)
        {                 
            for(int j=0;j<=i;j++)//for spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=s;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}