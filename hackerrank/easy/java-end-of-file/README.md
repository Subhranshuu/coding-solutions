# Java End-of-file

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

> "In computing, *End Of File* (commonly abbreviated *EOF*) is a condition in a computer operating system where no more data can be read from a data source."
&mdash; <cite>([Wikipedia: End-of-file](https://en.wikipedia.org/wiki/End-of-file))</cite>
    
The challenge here is to read $n$ lines of input until you reach *EOF*, then number and print all $n$ lines of content.

**Hint:** Java's *Scanner.hasNext()* method is helpful for this problem.


**Input Format**

Read some unknown $n$ lines of input from *stdin(System.in)* until you reach *EOF*; each line of input contains a non-empty *String*.

**Constraints**

 

**Output Format**

For each line, print the line number, followed by a single space, and then the line content received as input.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T11:13:42.582Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        
        // Continuously read until End-Of-File (EOF)
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-end-of-file/problem)