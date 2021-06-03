/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacePrep.MathProblems.Set1;
import java.util.*;
/**
 *
 * @author ritik
 */
public class SegmentedSieve {
    
    
    public static void sieve(int n)
	{
		boolean primecheck[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
                {
                    primecheck[i] = true;
                }
		for (int p = 2; p * p <= n; p++)
		{
                    if (primecheck[p] == true)
                    {
			for (int i = p * p; i <= n; i += p)
                        {
                            primecheck[i] = false;
                        }
                    }
		}
		for (int i = 2; i <= n; i++)
		{
                    if (primecheck[i] == true)
			System.out.print(i + " ");
		}
	}
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        sieve(n);        
    }
}
