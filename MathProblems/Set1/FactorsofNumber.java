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
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){                
                al.add(i);
            }
        }
        int limit = al.size();
        for(int i=0;i<limit/2;i++){            
            System.out.print(al.get(i)+" ");            
            System.out.print(al.get(limit-i-1)+" ");            
        }
        if(limit%2!=0){
            System.out.print(al.get(limit/2)+" ");
        }
        
    }
}
