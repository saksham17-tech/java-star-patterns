import java.util.*;
class star12
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        int x=2*s - 3;
        for(int i=1;i<=s;i++)
        {                 
            if(i==1)
            {
                for(int v=1;v<s;v++)//top of triangle
                {
                    System.out.print("* ");
                }
            }
            for(int j=2;j<=i;j++)//for spaces before left side
            {
                System.out.print(" ");
            }
            for(int j=i;j<=i;j++)//for left side
            {
                System.out.print("*");
            }

            if(i>1 && i<s)
            {
                for(int k=2;k<x;k++)//spaces in between
                    {
                        System.out.print(" ");
                    }
                    x-=2;
                for(int k=i;k<=i;k++)//for right side
                {
                    System.out.print("*");
                }                
            }
            System.out.println();
        }
    }
}