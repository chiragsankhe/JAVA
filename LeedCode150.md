## 1
+ 27. Remove Element
```
class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0 ;
        for(int i = 0 ;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }
}
```
## 2
+ 26. Remove Duplicates from Sorted Array
```
   class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 0 ;

        for(int x:nums)
        {
            if(k==0 || x!=nums[k-1])
            {
                nums[k]= x;
                k++;
            }
        } 

        return k;
        
    }
}
```   
## 3
+ 189. Rotate Array
```
class Solution {
    public void rotate(int[] nums, int k) {
         k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }

        
    }
}
```
## 4
+ 169. Majority Element
```
class Solution {
    public int majorityElement(int[] nums) { 
      int count =  0;
      int ans = 0 ;

    for(int n : nums)
    {
       if(count ==0 )
       {
        ans = n;
       }
       count += (n == ans)? 1: -1;
    }

    return ans;
    }

    
}
```
## 5
+ 58. Length of Last Word
```
class Solution {
    public int lengthOfLastWord(String s) {

       s = s.trim();
        
        // Split the string by spaces
        String[] words = s.split(" ");
        
        // Get the last word
        String lastWord = words[words.length - 1];
        
        // Return the length of the last word
        return lastWord.length();

    }
}
```
## 6
+ 151. Reverse Words in a String
```
class Solution {
    public String reverseWords(String s) {
         // Trim leading and trailing spaces
        s = s.trim();
        
        // Split the string by spaces
        String[] words = s.split("\\s+");
        
        // Use StringBuilder to construct the reversed string
        StringBuilder str = new StringBuilder();
        
        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            str.append(words[i]);
            if (i > 0) {
                str.append(" "); // Add a space between words
            }
        }
        
        // Return the result as a string
        return str.toString();
    

        
    }
}
```
## 7
+ 28. Find the Index of the First Occurrence in a String
```
class Solution {
    public int strStr(String haystack, String needle) {
        // Handle the case where needle is an empty string
        if (needle.isEmpty()) {
            return 0;
        }

        int len = needle.length();

        // Loop through the haystack with a valid range
        for (int i = 0; i <= haystack.length() - len; i++) {
            // Extract substring of length `len` from haystack
            String str = haystack.substring(i, i + len);

            // Check if the substring matches the needle
            if (str.equals(needle)) {
                return i;
            }
        }

        // If no match is found, return -1
        return -1;    }
}
```
## 8
+ 125. Valid Palindrome
```
class Solution {
    public boolean isPalindrome(String s) {
          // Step 1: Normalize the input string
        s = s.toLowerCase(); // Convert to lowercase
        s = s.replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters
        
        // Step 2: Check if the string is a palindrome
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; 
        }

      
        
    }

```
## 9
+ 392. Is Subsequence
```
class Solution {
    public boolean isSubsequence(String s, String t) {
      
       if(s.length()>t.length()) return false;

        if(s.length()==0) return true;

        int index=0;
        
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(index)){
                if(index==s.length()-1) return true;
                index++;
            }
        }
        return false;
    }
}
```
## 10
+ 80. Remove Duplicates from Sorted Array II
```
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length <=2)
        {
            return nums.length;
        }

        int k = 2 ;

        for(int i = 2 ;i<nums.length;i++)
        {
            if(nums[i] != nums[k-2])
            {
                nums[k] = nums[i] ;
                k++;
            }
        }
        
        return k;

       
    }
}
```
## 11
+ 80. Remove Duplicates from Sorted Array II
```
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 1;
        int count = 0 ;
        for(int i = 1 ;i<nums.length;i++)
        { if(nums[i] == nums[i-1] && count >=2)
        {
            continue;
        }
           else  if(nums[i] == nums[i-1] && count ==0)
            {
                count = 2;
                nums[index ] = nums[i];
                index++;
            }
            else {
                count = 0 ;
                nums[index] = nums[i];
                index++;
            }
            
        }

        return index;


    }
}
```
## 12
+ 80. Remove Duplicates from Sorted Array II
```
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 1;
        int count = 0 ;
        for(int i = 1 ;i<nums.length;i++)
        { if(nums[i] == nums[i-1] && count >=2)
        {
            continue;
        }
           else  if(nums[i] == nums[i-1] && count ==0)
            {
                count = 2;
                nums[index ] = nums[i];
                index++;
            }
            else {
                count = 0 ;
                nums[index] = nums[i];
                index++;
            }
            
        }

        return index;


    }
}

```
## 13
+ 55. Jump Game
```
class Solution {
    public boolean canJump(int[] nums) {
      int maxReachable = 0; // The farthest index we can reach

        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the farthest reachable index, return false
            if (i > maxReachable) {
                return false;
            }
            // Update the farthest reachable index
            maxReachable = Math.max(maxReachable, i + nums[i]);
            // If we can reach or surpass the last index, return true
            if (maxReachable >= nums.length - 1) {
                return true;
            }
        }
        return false;
      
    }
}
```
## 14
+ 45. Jump Game II
```
class Solution {
    public int jump(int[] nums) {
        
 int jumps = 0; // Number of jumps taken
        int currentEnd = 0; // The farthest index we can reach with the current jump
        int farthest = 0; // The farthest index we can reach in total

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest reachable index from the current position
            farthest = Math.max(farthest, i + nums[i]);

            // If we've reached the end of the current jump, increment the jump count
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // If the currentEnd reaches or exceeds the last index, we can stop
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
```
## 15
+ 238. Product of Array Except Self
```
class Solution {
     public int[] productExceptSelf(int[] nums) {
    final int n = nums.length;
    int[] ans = new int[n];    // Can also use `nums` as the ans array.
    int[] prefix = new int[n]; // prefix product
    int[] suffix = new int[n]; // suffix product

    prefix[0] = 1;
    for (int i = 1; i < n; ++i)
      prefix[i] = prefix[i - 1] * nums[i - 1];

    suffix[n - 1] = 1;
    for (int i = n - 2; i >= 0; --i)
      suffix[i] = suffix[i + 1] * nums[i + 1];

    for (int i = 0; i < n; ++i)
      ans[i] = prefix[i] * suffix[i];

    return ans;
  }


        
    
}
```
## 16
+ 167. Two Sum II - Input Array Is Sorted
```
class Solution {

    public int[] twoSum(int[] numbers, int target) {
        
        int arr[] = new int[2];

        int a  = 0 ;
        int b = numbers.length-1;
       

        while(a<b )
        {
            int c = numbers[a] + numbers[b];

            if(c == target)
            {
                arr[0] = a+1;
                arr[1] =b+1;
                break;

            }
            else if(c<target)
            {
                a++;
            }
            else{
                b--;
            }
        }

        return arr;
    }
}
```
## 17 
+ 11. Container With Most Water
```
class Solution {
    public int maxArea(int[] height) {
        int max = 0 ;

        int a = 0 ;
        int b = height.length -1;

        while(a<b)
        {
            int min_height = Math.min(height[a],height[b]);
            int base = b-a;

            int total = min_height*base;

            max = Math.max(max,total);

            if(height[a] < height[b] || height[a] == height[b])
            {   
                 a++;  
            }
            else if(height[b] < height[a])
            {   
                  b--; 
           }
           

            
        }

        return max;
    }
}
```
#### 18
+ fibonacci from 0 to n
```
  import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static void solve(int a, int b ,int n)
	{
		if(n==0) return ;
		int c = a+b;
		System.out.println(c);
	    solve(b,c,n-1);
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int a = 0;
		int b = 1;
          System.out.println(a);
		  System.out.println(b);
		solve( a , b , n-2);
	}
}
```
#### 19
+ x^n  10^3
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static int solve(int n , int num)
		{
			if(n==0) return 1;

			if(num==0) return 0;

             int xpowern = solve(n-1,num);
			 int power = num * xpowern;

			 return power;

		
		}

	public static void main(String args[])
	{
		

		Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
		int n = scn.nextInt();
		
        
		int ans=  solve(n ,num);

		System.out.println(ans);
		

	}
}
```

+ optimize solution of 19
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static int solve(int n , int num)
		{
			if(n==0) return 1;

			if(num==0) return 0;

            if(n%2 == 0)
			{
				return solve(n/2,num) *  solve(n/2,num); 
			} 
			else 
			{
				return  solve(n/2,num) *  solve(n/2,num) *num ;
			}
			
		
		}

	public static void main(String args[])
	{
		

		Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
		int n = scn.nextInt();
		
        
		int ans=  solve(n ,num);

		System.out.println(ans);
		

	}
}
```
#### 20 
+ tover of hanoi
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static void solve(int n , String start , String end , String helper )
		{ if(n == 1) {
		System.out.println( n + " " + start +" to " + end);
		return;
		}
           
		   solve(n-1,start,helper ,end);
		   System.out.println(n + " "+ start +" to "+ end );
		   solve(n-1, helper , end ,start );
		
		}

	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();

	   solve(n,"S","D","H");
	}
}
```
input
```
3
```
output
```
1 S to D
2 S to H
1 D to H
3 S to D
1 H to S
2 H to D
1 S to D

```
#### 21
+ reverse string
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static void reverseString(String str , int len)
	{
         if(len == 0 ) return;
		 char ch = str.charAt(len-1);
		System.out.print(ch);
		reverseString(str,len-1);
	}

	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();

	   int len = str.length();

	   reverseString(str,len);
	   
}
}
```
#### 22
+ frist and last occurence 
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static int frist = -1;
	static int last = -1;
	static void firstlastoccurence(String str , int len, char ele)
	{ 
		if(len == 0) {
		System.out.println(frist);
		System.out.println(last);
		 return;
		}

		
		   char currentEle = str.charAt(len-1);

              if(currentEle == ele)
			  {
				 if(frist == -1)
	         	  {
	        		frist = len-1;
	        	  }
		        else
		         {
		        	last = len-1;
		         }
			  }

			    firstlastoccurence(str,len-1,ele);

	}

	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
	   scn.close(); // Close scanner to prevent memory leak

	   int len = str.length();
    

	 firstlastoccurence(str,len,'a');
	   
}
}
```
#### 23 
+ incresing array 
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

	static boolean incresingarray(int arr[],int n,int index )
	{
		if(index == n-1) return true;


          if(arr[index]>=arr[index+1])
		  {
			return false;
		  }

		return  incresingarray(arr,n,index+1);

	}
	

	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
        
		int n = scn.nextInt();

		int arr[] = new int[n];
		for(int i= 0 ;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}

	   boolean ans =	incresingarray(arr , n , 0);

	   if(ans)
	   {
		System.out.println("true");
	   }
	   else
	   {
		System.out.println("false");
	   }
}
}
```
#### 24 
+ moveX
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	
	static int count = 0 ;
	 
	static void moveX(String str,int index)
	{
		if(index == str.length()) return;

		char ch = str.charAt(index);
		if(ch != 'x')
		{
			System.out.print(ch);
		}
		else
		{
			count++;
		}
         
	moveX(str,index+1);	 

	}
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
        
		String str = scn.next();

		 str = str.toLowerCase();
	     	scn.close();

		moveX(str,0);

		for(int i = 0 ;i<count;i++)
		{
			System.out.print("x");
		}
		
}
}
```
#### 25 
+ removeDuplicate
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static boolean map[] = new boolean[26];
	
	static void removeDuplicate(String str,int idx ,String newString )
	{
       if(idx == str.length())
	   {
		System.out.print(newString);
		return;
	   }
	   char ch = str.charAt(idx);

	   if(map[ch -'a'])
	   {
           removeDuplicate( str, idx+1,newString );
	   }
	   else
	   {
		newString += ch;
		map[ch- 'a'] = true;
		removeDuplicate( str, idx+1,newString );

	   }
	}
	public static void main(String args[])
	{

		Scanner scn = new Scanner(System.in);
		String str = scn.next();	

        removeDuplicate(str,0,"");


}
}
```
##### 26
+ subsquence
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static void subsquence(String str , int idx , String newString)
	{
		if(idx == str.length())
		{
          System.out.println(newString);
		 return;
		}

		char ch = str.charAt(idx);
		subsquence(str,idx+1,newString+ch);

		subsquence(str,idx+1,newString);
	}
		public static void main(String args[])
	{

		Scanner scn = new Scanner(System.in);
		String str = scn.next();	

       subsquence(str,0,"");


}
}
```
input 
```
abcd
```
output
```
abcd
abc
abd
ab
acd
ac
ad
a
bcd
bc
bd
b
cd
c
d


```
#### 27 
+ unique subseqence
```
import java.util.*;

class Main {
    static void uniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
            }
            return; // ✅ Important! Prevents out-of-bounds access
        }

        char ch = str.charAt(idx);
        
        // Include the current character
        uniqueSubsequence(str, idx + 1, newString + ch, set);

        // Exclude the current character
        uniqueSubsequence(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scn.next();
        scn.close(); // ✅ Close Scanner to prevent memory leaks

        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str, 0, "", set);
    }
}

```

input 
```
abcd
```
output
```
abcd
abc
abd
ab
acd
ac
ad
a
bcd
bc
bd
b
cd
c
d


```

#### 28
+ keypad
```
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashSet;

class Main{

	static String map[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	static void keypad(String str , int idx , String combination)
	{
		if(idx == str.length()) 
		{
			System.out.println(combination);
			return ;
		}

		char ch = str.charAt(idx);
		String mapping = map[ch-'0'];

		for(int i = 0 ;i<mapping.length();i++)
		{
             keypad(str , idx+1 , combination + mapping.charAt(i));
		}
	}
 	
		public static void main(String args[])
	{

		Scanner scn = new Scanner(System.in);
		String str = "23";

		keypad(str,0,"");



}
}
```

output
```
dg
dh
di
eg
eh
ei
fg
fh
fi

```
