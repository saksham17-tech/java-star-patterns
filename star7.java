import java.util.*;
public class star7 
{
    public static void main(String[] sm) 
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int s=sc.nextInt();
        int y=0;
        int p=s;
        if(s%2!=0)
        p++;
        y=p/2;        
        System.out.println();
        for(int i=0;i<s;i++)
        {                 
            for(int j=0;j<s;j++)
            {
                if((i+j)<=(y))
                System.out.print("  ");
                if((i+j)>y)
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}