import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int o=sc.nextInt();
	int c=sc.nextInt();
	int a=20-o;
	int max=c+(a*36);
	if(max > r){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
	

	}
}
