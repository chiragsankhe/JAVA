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
