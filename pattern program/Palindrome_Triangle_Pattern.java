import java.util.*;

class Palindrome_Triangle_Pattern
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1 ;i<=n;i++)
        {
            // space 
           for(int j = 1 ;j<=n-i;j++)
           {
            System.out.print("  ");
           }
        //    numver print 

        for(int k = i;k>=1;k--)
        {
            System.out.print(k + " ");
        }

        for(int x = 2 ;x<=i;x++)
        {
            System.out.print(x + " ");
        }
          System.out.println();
        }
    }
}