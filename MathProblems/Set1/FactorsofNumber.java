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
public class FactorsofNumber {
    public static void main(String[] args){
           
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
