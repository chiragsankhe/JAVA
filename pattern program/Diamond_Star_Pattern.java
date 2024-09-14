import java.util.*;

class Diamond_Star_Pattern
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
       
        for(int i = 1 ;i<=n;i++)
        {
            for(int j = 1 ;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int k = 1 ;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


      int space = 1;
      

        for(int i = 1 ;i<n;i++)
        {
            for(int j = 1 ;j<=space;j++)
            {
              System.out.print(" ");
            }
            space++;

            for(int k = 1 ;k<=n-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
  
    }
}