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
