
import java.util.Scanner;

class Increasing_reverse_Pyramid_Pattern 
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1 ;i<=n;i++)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}