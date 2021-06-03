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
public class SumofCoPrime {
    
    public static int gcd(int i,int n){
        if(i==0){
            return n;
        }
        return gcd(n%i , i);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        
        for(int i=1;i<=n; i++){
            if(gcd(i,n)==1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
