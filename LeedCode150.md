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
## 29
+ 3. Longest Substring Without Repeating Characters
```
class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();

        int left = 0 ; int maxlength = 0 ;

        for(int i = 0 ;i<s.length();i++)
        {
            char rightchar = s.charAt(i);
            while(set.contains(rightchar))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(rightchar);
            maxlength = Math.max(maxlength,i - left + 1);
        }

        return maxlength;
    }

}
```
#### 30 
+ all perutation
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static void printprem(String s , String permulation)
	{
		if(s.length() == 0 ) 
		{
			System.out.println(permulation);
			return;
		}

		System.out.println(permulation);

         
		for(int i = 0 ;i<s.length();i++)
		{
			char ch = s.charAt(i);
			String newSting = s.substring(0,i) + s.substring(i+1);
			printprem(newSting , permulation + ch );
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		String s = scn.next();

		printprem(s,"");
	}
}
```
input 
```
abc
```
output
```

a
ab
abc
ac
acb
b
ba
bac
bc
bca
c
ca
cab
cb
cba

```
## 30 
+ permulation
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static void printprem(String s , String permulation)
	{
		if(s.length() == 0 ) 
		{
			System.out.println(permulation);
			return;
		}
         
		for(int i = 0 ;i<s.length();i++)
		{
			char ch = s.charAt(i);
			String newSting = s.substring(0,i) + s.substring(i+1);
			printprem(newSting , permulation + ch );
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		String s = scn.next();

		printprem(s,"");
	}
}
```
input 
```
abc
```
output 
```
abc
acb
bac
bca
cab
cba

```
### 31
+ maze path matrix problem 
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int countpath(int i , int j , int n , int m )
	{
		if(i == n || j == m ) return 0;

		if(i == n-1 && j == m-1 ) return 1;

		int downpaths = countpath(i+1,j, n, m);

		int rightpath = countpath(i, j+1,n ,m );

		return downpaths + rightpath;

	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();


           int ans = countpath(0,0, n, m);

		   System.out.print(ans);

	}
}
```
input 
```
3 3 
```
output 
```
6
```

#### 32 
+ tile & floor 
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int tile_floor(int n , int m )
	{
		if(n<m) return 1;

		if(n==m) return 2;
		int verplacement = tile_floor(n-m,m);

	    int horplacement = tile_floor(n-1,m);

		return verplacement + horplacement;

	
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();


       int ans =  tile_floor(n , m );
	   System.out.print(ans);


	}
}
```
input 
```
n = 4
m = 2 
```

output 
```
5
```
#### 33
+ find the number of way in which you can invite n people to your party .single or in pair
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int  callguest(int n )
	{
		if(n <= 1 ) return 1;

		int single = callguest(n-1);

		int pair = (n-1) * callguest(n-2);

		return single + pair ;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		
		int ans = callguest(n);

		System.out.println(ans);



	}
}
```

### 34 
+ subset
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static void printsubset(ArrayList<Integer> subset)
	{
		for(int i = 0 ;i<subset.size();i++)
		{
			System.out.print(subset.get(i)+ "");

		}
		System.out.println();
	}

	static void findsubsets(int n , ArrayList<Integer> subset )
	{

		if(n == 0 )
		{
			printsubset(subset);
			return;

		} 
		subset.add(n);
		findsubsets(n-1,subset);

		subset.remove(subset.size()-1);
		findsubsets(n-1,subset);	
		
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		
		ArrayList<Integer> subset = new ArrayList<>();
		findsubsets(n,subset);

		



	}
}
```
input 
```
4
```
output 
```
4321
432
431
43
421
42
41
4
321
32
31
3
21
2
1


```
#### 35
+ merge sort 
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static void conqure(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1; // Fix: idx2 should start from mid + 1
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) { // Fix: Start from 'si'
            arr[j] = merged[i];
        }
    }

    static void divide(int arr[], int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqure(arr, si, mid, ei);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        divide(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

```

### 36
+ quick sort 
```
import java.util.*;

public class Main {

    static int position(int arr[], int low, int high) {
        int pivot = arr[high];  // Choose pivot as the last element
        int i = low - 1;         // Pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;  
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with the element at i+1 (correct position)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the correct pivot index
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = position(arr, low, high);

            quickSort(arr, low, pidx - 1);  // Sort left partition
            quickSort(arr, pidx + 1, high); // Sort right partition
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

```
input 
```
6
2 8 7 9 3 4
```
output 
```
2 3 4 7 8 9
```
#### 37
```

        import java.util.*;

class Solution {
    // Merge function for Merge Sort
    static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merge[x++] = arr[idx2++];
        }

        // Copy sorted elements back to original array
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    // Recursive Merge Sort function
    static void divide(int arr[], int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    // Function to merge two sorted arrays
    public void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        while (i < m) temp[k++] = nums1[i++];
        while (j < n) temp[k++] = nums2[j++];

        // Copy merged elements back to nums1
        for (i = 0; i < (m + n); i++) {
            nums1[i] = temp[i];
        }
    }

    // Main function to test Merge Sort and Merge Function
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input for Merge Sort
        System.out.print("Enter number of elements for sorting: ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Perform Merge Sort
        divide(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Input for merging two sorted arrays
        System.out.print("Enter size of first sorted array: ");
        int m = scn.nextInt();
        int[] nums1 = new int[m + n];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scn.nextInt();
        }

        System.out.print("Enter size of second sorted array: ");
        int n2 = scn.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scn.nextInt();
        }

        // Merge two sorted arrays
        Solution sol = new Solution();
        sol.mergeSortedArrays(nums1, m, nums2, n2);

        System.out.println("Merged sorted array:");
        for (int i = 0; i < (m + n2); i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}

```

#### 38
+ 121. Best Time to Buy and Sell Stock
```
class Solution {
    public int maxProfit(int[] prices) { 
        
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0 ;

        for(int price:prices)
        {
            if(price < minprice)
            {
                minprice = price;
            }
            else
            {
                maxprofit = Math.max(maxprofit , price - minprice);
            }
        }
        return maxprofit;
    }
}
```
#### 39
+ 122. Best Time to Buy and Sell Stock 2
```
class Solution {
    public int maxProfit(int[] prices) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0 ;

        for(int price : prices)
        {
            if(price < minprice)
            {
                minprice = price;
            }
            else 
            {
                int profit = price - minprice ;
                maxprofit += profit ;
                minprice = price;
            }
        }

        return maxprofit;
        
    }
}
```
#### 40 
+ ZIGZAG CANVERSION
```
 class Solution {
    public String convert(String s, int numRows) { 
            
            if(numRows == 1) return s;

            StringBuilder [] rows = new StringBuilder[numRows];

            for(int i = 0 ;i<numRows;i++)
            {
                rows[i] = new StringBuilder();
            }

            int i = 0 ;
            while(i<s.length())
            {
                for(int j = 0 ; j<numRows && i< s.length() ;j++ )
                {
                    rows[j].append(s.charAt(i++));
                }


                for(int j = numRows -2 ; j> 0 && i < s.length() ; j--)
                {
                    rows[j].append(s.charAt(i++));
                }
            }


             StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();

    }
}

````
input 
```
PAYPALISHIRING 3
```
output 
````
PAHNAPLSIIGYIR
````
#### 41 
+ 69. Sqrt(x) 
```
class Solution {
    public int mySqrt(int x) {
       
        return (int) Math.sqrt(x);

    }
}
```
#### 42
+ 66. Plus One
```
class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1; // Start with 1 since we're adding 1

        for (int i = digits.length - 1; i >= 0; i--) { // Loop should include i == 0
            int sum = digits[i] + carry;
            if (sum > 9) {
                digits[i] = sum % 10; // Extract last digit
                carry = 1; // Carry over the extra 1
            } else {
                digits[i] = sum;
                return digits; // No need to continue if no carry
            }
        }

        // If carry is still 1, we need an extra digit
        int[] arr = new int[digits.length + 1];
        arr[0] = 1; // Carry becomes the first digit
        return arr; // Other elements are already 0 by default
    }
}

```

#### 43
+ 9. Palindrome Number
```
class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int reverse = 0 ;
        while(x>0)
        {
             int lastDigit = x%10;
             reverse  = (reverse *10) + lastDigit;
             x = x/10;      
        }

        if(og == reverse)
        {
           return  true;
        }
        else 
        {
           return  false;
        }
    }
}
```
#### 44
+ palindrom number
```
class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int reverse = 0 ;
        while(x>0)
        {
             int lastDigit = x%10;
             reverse  = (reverse *10) + lastDigit;
             x = x/10;      
        }

        if(og == reverse)
        {
           return  true;
        }
        else 
        {
           return  false;
        }
    }
}
```
#### 45 
+ pow
```
class Solution {
    public double myPow(double x, int n) {
        
         return Math.pow(x,n);
    }
}
```
#### 46
+ 172. Factorial Trailing Zeroes
```
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;  // Reduce n to count higher powers of 5
        }
        return count;
    }
}

```

## LinkList 
### 
+ 21. Merge Two Sorted Lists
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null )
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }
        

        
       if(list1.val <= list2.val)
       {
        list1.next = mergeTwoLists(list1.next,  list2);
        return list1;
       }
       else
       {
        list2.next = mergeTwoLists( list1 ,list2.next);
        return list2;
       }
        
    }
}
```

#### Understanding How the Merging Works
+ We are given two sorted linked lists:

Example Input:
```
list1 = [1 → 3 → 5]
list2 = [2 → 4 → 6]
```
+ Step-by-Step Breakdown:
The recursive function follows these steps:

1. Compare `list1.val` and `list2.val`.

+ `list1.val = 1`, `list2.val = 2`
+ Since 1 <= 2, we keep list1 as the first node and recursively call mergeTwoLists(list1.next, list2).
2. Remaining lists:
```
list1.next = mergeTwoLists([3 → 5], [2 → 4 → 6])
```
3. Next recursive call
+ list1.val = 3, list2.val = 2

+ Since 2 < 3, we keep list2 as the next node and recursively call mergeTwoLists(list1, list2.next).
Remaining lists:
```
list2.next = mergeTwoLists([3 → 5], [4 → 6])
```
4. Next recursive call:
+ list1.val = 3, list2.val = 4
+ Since 3 <= 4, we keep list1 and recurse with mergeTwoLists(list1.next, list2).
Remaining lists:
```
list1.next = mergeTwoLists([5], [4 → 6])
```
5. Next recursive call:

+ list1.val = 5, list2.val = 4
+ Since 4 < 5, we keep list2 and recurse with mergeTwoLists(list1, list2.next).
Remaining lists:
```
list2.next = mergeTwoLists([5], [6])
```
6. Next recursive call:

+ list1.val = 5, list2.val = 6
+ Since 5 <= 6, we keep list1 and recurse with mergeTwoLists(list1.next, list2).
Remaining lists:
```
list1.next = mergeTwoLists(null, [6])
```
7. Base Case Reached:

+ list1 is null, so we return list2 (which is [6]).
+ Returning: [6]
+ Building the Final Merged List
+ Now, let's track how the merged list is built backward as recursion unwinds:
```
list1.next = [6] → Merging into: [5 → 6]
list2.next = [5 → 6] → Merging into: [4 → 5 → 6]
list1.next = [4 → 5 → 6] → Merging into: [3 → 4 → 5 → 6]
list2.next = [3 → 4 → 5 → 6] → Merging into: [2 → 3 → 4 → 5 → 6]
list1.next = [2 → 3 → 4 → 5 → 6] → Merging into: [1 → 2 → 3 → 4 → 5 → 6]
```
+ Final Output Linked List
```
[1 → 2 → 3 → 4 → 5 → 6]
```
#### Key Observations
+ Recursive function compares list1.val and list2.val at each step.
+ The smaller value is selected as the next node of the result list.
+ The recursion continues until we reach the base case (list1 == null or list2 == null).
+ When recursion returns, the linked list is built back up step by step.
#### Time & Space Complexity
+ Time Complexity: O(n + m) → We process each node once.
+ Space Complexity: O(n + m) → Due to recursion stack usage

## 
+ 61. Rotate List
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       
       if( head == null || head.next == null || k == 0 )
       {
        return head;
       }
        
        int length = 1 ;
        ListNode curr = head;
        while( curr.next != null)
        {
            curr = curr.next;
            length++;
        }

        k = k % length;
        if(k == 0 )
        {
            return head;
        }
        //  now the curr is at last postion 
        // that why we made it circular linklist 
        curr.next = head;

        int tailpos = length - k;
        ListNode newtail = head;
        for(int i = 1 ;i<tailpos;i++)
        {
            newtail = newtail.next;
        }
        head = newtail.next;
        newtail.next = null;

        return head;

        
    }
}
```
## 
+ 234 palindrom linkList
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null) { // Fix: Traverse the entire list
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev; // Fix: Return the new head of the reversed list
}
    public ListNode findmiddle(ListNode head)
    {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null)
        {
            hare = hare.next.next ;
            turtle = turtle.next;

        }

        return turtle;

    }
    public boolean isPalindrome(ListNode head) {

         if (head == null || head.next == null) {
        return true; // A single node or empty list is always a palindrome
    }

    // Step 1: Find the middle of the linked list
    ListNode middle = findmiddle(head);

    // Step 2: Reverse the second half of the list
    ListNode secondHalfStart = reverse(middle.next);

    // Step 3: Compare the first half with the reversed second half
    ListNode firstHalfStart = head;
    ListNode temp = secondHalfStart; // Store for later restoring the list

    while (secondHalfStart != null) {
        if (firstHalfStart.val != secondHalfStart.val) {
            return false; // If mismatch found, not a palindrome
        }
        firstHalfStart = firstHalfStart.next;
        secondHalfStart = secondHalfStart.next;
    }

    return true;
        
    }
}
```

## 1D 
+ climbing a stairs
```
class Solution {
    public int climbStairs(int n) {
        if(n== 1 ) return 1 ;
        if(n == 2 ) return 2;   

      int first = 1 , secound = 2 , temp;
      for(int i = 3 ;i<=n;i++)
      {
        temp = first + secound;
        first = secound;
        secound = temp;
      }

      return secound;
    }
}
```
## Stack 
+ valid parentheses 
```
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
 

        for(char ch : s.toCharArray())
        {
             if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if(ch == ')' || ch == '}' || ch == ']' )
            {
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if(ch == ')' && top != '(' ||
                   ch == '}' && top != '{' ||
                   ch == ']' && top != '[' 
                 )
                {
                    return false;
                }     
            }

           
        }


         return stack.isEmpty();
    }
}
```
## simplify path
```
class Solution {

    public String simplifyPath(String path) {
        
         Deque<String> stack = new ArrayDeque<>();

        for(String str : path.split("/"))
        {
            if(str.isEmpty() || ".".equals(str))
            {
                continue;
            }

            if ("..".equals(str)) {
                if (!stack.isEmpty()) {  // ✅ Only pop if stack is not empty
                    stack.pop();
                }
                continue;  // ✅ Don't push ".." into stack
            }

            stack.push(str);
        }


         // Convert stack to a list and reverse it
        ArrayList<String> resultList = new ArrayList<>(stack);
        Collections.reverse(resultList);

        // Join elements with "/" and return the final path
        return "/" + String.join("/", resultList);
        
    }
}
```
```
Input: path = "/home/user/Documents/../Pictures"

Output: "/home/user/Pictures"

Explanation:

A double period ".." refers to the directory up a level (the parent directory).
```

