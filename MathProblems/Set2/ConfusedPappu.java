/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacePrep.MathProblems.Set2;

import java.util.Scanner;

/**
 *
 * @author ritik
 */
public class ConfusedPappu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int rev=0;
            for(int i=n;i>0;i/=10){
                int temp = i%10;
                if(temp==6){
                    rev = (rev*10)+9;
                }else{
                    rev = (rev*10)+temp;
                }
            }
            int rev2=0;
            for(int j=rev;j>0;j/=10){
                int temp = j%10;
                rev2 = (rev2*10)+temp;
            }
            System.out.println(rev2-n);
        }
    }
}
/*
public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t , n , extra , rem , temp , place = 1 ;
	    t=sc.nextInt(); 
	
	while(t-- > 0)
	{
	    extra = 0 ;
	    place = 1 ;
	    n=sc.nextInt();
    	temp = n ;
    	
    	while(n>0)
    	{
    	    rem = n%10 ;
    	    if(rem == 6)
    	        rem = 9 ;
    	        
    	    rem *= place ;
    	    extra += rem ;
    	    n /= 10 ;
    	    place *= 10 ;
    	}
    	System.out.println(extra - temp);
	}
	}
*/