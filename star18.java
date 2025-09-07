import java.util.*;
class star18
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        for(int i=0;i<s;i++)
        {                 
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<s;j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        for(int i=s-1;i>=1;i--)
        {                 
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");  
            }  
            for(int k=i;k<=s;k++)
            {
                System.out.print(k+" ");                                
            } 
            System.out.println();
        }
        sc.close();
    }
}