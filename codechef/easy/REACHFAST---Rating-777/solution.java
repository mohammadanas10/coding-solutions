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
	    int k=sc.nextInt();
	    int distance=Math.abs(a-b);
	    int s=(distance+k-1)/k;
	    
	    System.out.println(s);
	}

	}
}
