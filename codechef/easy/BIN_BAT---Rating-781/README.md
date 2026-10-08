# BIN_BAT - Rating 781

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T11:57:36.621Z  

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
	    int sum=0;
	    for(int i=0;i<n;i++){
	        int v=sc.nextInt();
	        sum += v;
	    }
	    if(n%2 != 0){
	        System.out.println(-1);
	    }else{
	        System.out.println(Math.abs(sum)/2);
	    }
	}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BIN_BAT)