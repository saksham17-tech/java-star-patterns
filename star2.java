
import java.util.*;
public class star2
{
    public static void main(String[] sm)

    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


