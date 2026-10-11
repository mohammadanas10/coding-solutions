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
	    int a1=sc.nextInt();
	    int a2=sc.nextInt();
	    int a3=sc.nextInt();
	    int b1=sc.nextInt();
	    int b2=sc.nextInt();
	    int b3=sc.nextInt();
	    
	    int a=(a1+a2+a3)-Math.min(a1,Math.min(a2,a3));
	    int b=(b1+b2+b3)-Math.min(b1,Math.min(b2,b3));
	    
	    if(a>b){
	        System.out.println("Alice");
	        
	    }else if(b>a){
	        System.out.println("Bob");
	    }else{
	        System.out.println("Tie");
	    }
	    
	}

	}
}
