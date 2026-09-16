# Reverse Vowels of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse only all the vowels in the string and return it.

The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.

 

 **Example 1:** 

 **Input:**  s = "IceCreAm"

 **Output:**  "AceCreIm"

 **Explanation:** 

The vowels in `s` are `['I', 'e', 'e', 'A']`. On reversing the vowels, s becomes `"AceCreIm"`.

 **Example 2:** 

 **Input:**  s = "leetcode"

 **Output:**  "leotcede"

 

 **Constraints:** 

- 1 <= s.length <= 3 * 105
- s consist of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 62.91%)  
**Memory:** 46.7 MB (beats 33.93%)  
**Submitted:** 2026-09-16T03:06:18.320Z  

```java
class Solution {
    public String reverseVowels(String s) {
        // Convert string to character array for in-place modifications
        char[] chars = s.toCharArray();
        
        // Define a fast lookup string for vowels (both lowercase and uppercase)
        String vowels = "aeiouAEIOU";
        
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            // Move the start pointer forward until it finds a vowel
            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }
            
            // Move the end pointer backward until it finds a vowel
            while (start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }
            
            // Swap the vowels found at start and end pointers
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            // Move both pointers forward to continue checking the rest of the string
            start++;
            end--;
        }
        
        return new String(chars);
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/)