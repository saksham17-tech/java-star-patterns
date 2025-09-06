import java.util.*;
public class star1
{
    public static void main(String[] sm)
    {
        //hollow square
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your square: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||j==(n-1)||i==(n-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}