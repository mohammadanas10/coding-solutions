# DPOLY - Rating 790

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T08:12:02.342Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	if(!sc.hasNextInt())return;
	int n=sc.nextInt();
	
	int c1=0;
	int c2=0;
	int max=0;
	int win=0;
	
	for(int i=0;i<n;i++){
	    int s1=sc.nextInt();
	    int s2=sc.nextInt();
	    
	    c1 += s1;
	    c2 += s2;
	    
	    int cl=0;
	    int cw=0;
	    
	    if(c1>c2){
	        cl=c1-c2;
	        cw=1;
	    }else{
	        cl=c2-c1;
	        cw=2;
	    }
	    if(cl>max){
	        max=cl;
	        win=cw;
	    }
	}
	System.out.println(win+" "+max);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DPOLY)