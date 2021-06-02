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
public class ReverseANumber {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        for(int i=n;i>0;i/=10){
            int temp = i%10;
            rev = 10*rev + temp;
        }
        
        System.out.println(rev);
        
    }
}
