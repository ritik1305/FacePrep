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
public class GCDandLCM {
    
    public static int GCD(int a, int b){
        if(a%b==0){
            return b;
        }
        return GCD(b,a%b);
    }
    
    public static int LCM(int a,int b){
        int max = a;
        while(true){
            if(max%a==0 && max%b==0){
                break;
            }else{
                max++;
            }
        }
        return b;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd,lcm;
        if (a>b){
            gcd = GCD(a,b);
            lcm = LCM(a,b);
        }
        
        else{
            gcd = GCD(b,a);
            lcm = LCM(a,b);
        }
        System.out.println(gcd+" "+lcm);
    }
}
