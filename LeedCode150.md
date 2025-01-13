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
+
```
```
## 9
## 10
