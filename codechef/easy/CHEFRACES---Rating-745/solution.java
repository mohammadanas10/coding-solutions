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
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int g=0;
	    if(x != a && x != b){
	        g++;
	    }
	    if(y != a && y != b){
	        g++;
	    }
	    System.out.println(g);
	}

	}
}
