import java.util.*;

class Reverse_number_Triangle_Pattern
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 0 ;i<n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(" ");
            }

            for(int k = i+1;k<=n;k++)
            {
                 System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}