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
	    if(n<=1){
	        System.out.println("no");
	    continue;
	    }
	    boolean isPrime=true;
	    for(int i=2;i<n;i++){
	        if(n%i==0){
	            isPrime=false;
	            break;
	        }
	    }
	    if(isPrime){
	        System.out.println("yes");
	    }else{
	        System.out.println("no");
	    }
	}

	}
}
