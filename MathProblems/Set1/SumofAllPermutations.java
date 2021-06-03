/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacePrep.MathProblems.Set1;

import java.util.Scanner;

/**
 *
 * @author ritik
 */
public class SumofAllPermutations {
    
    static int factorial(int n)
    {
            int fact = 1;
            if (n == 0|| n == 1)
                    return 1;
            for (int i = 2; i <= n; i++)
                    fact = fact * i;
            return fact;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int fact = factorial(n);
  
	int digitsum = 0;
	for (int i = 0; i < n; i++)
		digitsum += arr[i];
	digitsum *= (fact / n);

	int ans = 0;
	for (int i = 1, k = 1;i <= n; i++)
	{
		ans += (k * digitsum);
		k = k * 10;
	}
	
        System.out.println(ans);
    }
}
