# CHN15A - Rating 770

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T11:49:43.623Z  

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
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    if(a<b){
	        System.out.println("<");
	    }else if(a>b){
	        System.out.println(">");
	    }else{
	        System.out.println("=");
	    }
	}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHN15A)