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
public class NoofPalindromes {
    
    public static boolean palindromeCheck(long n){
        long rev=0;
        for(long i=n;i>0;i/=10){
            long temp = i%10;
            rev = 10*rev + temp;
        }
        if(rev==n)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long limit = (long) Math.pow(10, n);
        long count=0;
        for(long i=1;i<limit;i++){
            if(palindromeCheck(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
