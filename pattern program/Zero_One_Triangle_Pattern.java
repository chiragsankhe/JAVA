import java.util.*;

class Zero_One_Triangle_Pattern
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1 ;i<n;i++)
        {
            for(int j = 1 ;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print(1 + " ");

                }else{
                    System.out.print(0 + " ");
                }
                
            }
            System.out.println();
        }
    }
}