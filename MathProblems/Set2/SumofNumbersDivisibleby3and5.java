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
public class SumofNumbersDivisibleby3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int s=0;
        for(int i=m;i<n;i++){
            if(i%15==0){
                s+=i;
            }
        }
        System.out.println(s);
        
    }
}
