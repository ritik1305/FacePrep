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

public class SumofPrimeFactors {
    
     public static boolean isPrime(int n){
         boolean flag = false;
         for(int j=2;j<=n/2;j++){
             if(n % j == 0){
                 flag=true;
                 break;
             }
         }
         return flag;
     }
    
     public static void main(String[] args){
           
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i=2; i<=n; i++){
            if(n%i==0){                
                if(!isPrime(i)){
                    //System.out.print(i+" ");
                    s+=i;
                }
            }
        }
         System.out.println(s);
    }
}
