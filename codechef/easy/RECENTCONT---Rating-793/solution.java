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
	    int s=0;
	    int l=0;
	    
	    for(int i=0;i<n;i++){
	        String code=sc.next();
	        if(code.equals("START38")){
	            s++;
	        }else{
	            l++;
	        }
	    }
	    System.out.println(s+" "+l);
	}

	}
}
