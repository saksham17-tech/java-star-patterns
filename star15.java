import java.util.*;
class star15
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        for(int i=1;i<s;i++)//top half
        {                 
            for(int j=1;j<=i;j++)//left stars
            {
                if((i+j)%2==0)
                System.out.print("* ");
                if((i+j)%2!=0)
                System.out.print("  ");
            }
            for(int j=s-i;j>=1;j--)//middle space
            {
                System.out.print("  ");
            }
            for(int j=s-i-1;j>=1;j--)//middle space
            { 
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--)//right stars
            {
                if((i+j)%2==0)
                System.out.print("* ");
                if((i+j)%2!=0)
                System.out.print("  ");
            }
            System.out.println();  
        }
        int p=2*s-1;
        for(int i=0;i<p;i++)//for middle portion
        {
            if(i%2==0)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
        for(int i=1;i<s;i++)//bottom half
        {
            for(int j=1;j<=s-i;j++)//left stars
            {
                if((i+j)%2==0)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++)//middle space
            {
                System.out.print("  ");
            }
            for(int j=2;j<=i;j++)//middle space
            {
                System.out.print("  ");
            }
            for(int j=s-i;j>=1;j--)//right stars
            {
                if((i+j)%2==0)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }        
        sc.close();
    }
}