import java.util.*;
class star17
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        System.out.println();
        for(int i=1;i<=s;i++)
        {                 
            for(int j=1,k=s,p=s-i;j<=s;j++,k--,p--)
            {
                if(p<=0)
                System.out.print(k+"  ");
                if(p>=1)
                System.out.print("   ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }  
        sc.close();
    }
}