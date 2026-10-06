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
	    int k=sc.nextInt();
	    int ans=0;
	    
	    for(int i=0;i<n;i++){
	        int a=sc.nextInt();
	        
	        if((a+k)%7==0){
	            ans++;
	        }
	    }
	    System.out.println(ans);
	}

	}
}
