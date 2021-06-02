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
public class PrimeNumbers_tillN {
    public static void main(String args[])
  {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i<=n;i++){
      boolean check=true;
      for(int j=2;j<i;j++){
        if(i%j==0){
          check=false;        
        }
      }
      if(check==true)
        System.out.print(i+" ");
    }
    
    
  }
}
