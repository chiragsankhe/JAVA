import java.util.Scanner;

class Number_increasing_Pyramid_Pattern 
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1 ;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}