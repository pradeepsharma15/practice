/*package whatever //do not write package name here */
// remove all zeros by 5
import java.io.*;
import java.util.Scanner;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("enetr a number with atleast single digit is zero");
		int n=1009;
		double sum=0;
		int i=0;
		int r;
		while(n>0){
		    r=n%10;
		    if(r==0){
		        r=5;
		    }
		    
		    sum=sum+r*Math.pow(10,i) ;
		    i++;
		    n=n/10;
		    
		}
		System.out.print(sum);
	}
}
