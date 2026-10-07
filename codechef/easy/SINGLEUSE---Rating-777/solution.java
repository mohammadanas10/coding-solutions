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
	    int h=sc.nextInt();
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int a=h-y;
	    int b=(a+x-1)/x;
	    System.out.println(b+1);
	}

	}
}
