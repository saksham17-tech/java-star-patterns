import java.util.*;
class star11
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        int x=1;
        for(int i=1;i<=s;i++)
        {                 
            for(int j=1;j<=s-i;j++)//for spaces before the left side of triangle
            {
                System.out.print(" ");
            }
            for(int j=i;j<=i;j++)//for the left side of triangle
            {
                System.out.print("*");
            }
            if(i==s)
            {
                for(int v=1;v<=s-1;v++)//for base of triangle
                {
                System.out.print(" *");
                }
            }
            if(i>=2&&i<s)
            {
                for(int k=1;k<=x;k++)//for space in between the sides
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=1;k++)//for right side of triangle
                {
                    System.out.print("*");
                }
                x+=2;
            }
            System.out.println();
        }
    }
}