import java.util.*;
import java.lang.*;
import java.io.*;

public class Square_Hollow_Pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for(int i = 1 ;i<=n;i++)
		{
			

			for(int j = 1 ;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j== n )
				{
					System.out.print("*");

				}else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		} 
	}
}


