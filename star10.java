import java.util.*;
class star10 
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
    }
}