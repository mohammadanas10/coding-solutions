# FLOW018 - Rating 760

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Small Factorial

Write a program to find the factorial value of any number entered by the user.

### Input Format

The first line contains an integer  **T**, the total number of testcases. Then  **T**  lines follow, each line contains an integer  **N**.

### Output Format

For each test case, display the factorial of the given number  **N**  in a new line.

### Constraints
- 1 ≤ T ≤ 1000
- 0 ≤ N ≤ 20
### Sample 1:
Input
Output

```
3 
3 
4
5

```

```
6
24
120

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T08:28:09.679Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-- > 0){
        int n=sc.nextInt();
       long f=1;
       for(int i=1;i<=n;i++){
           f *= i;
       }
       System.out.println(f);
        
    }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW018)