import java.util.Scanner;

public class star3 {
    public static void main(String[] sm)

    {
        //hollow square
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your pattern: ");
        int n=sc.nextInt();
        int x=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=x;j++)
            {
                System.out.print(j+" ");
            }
            --x;
            System.out.println();
        }
    }
}