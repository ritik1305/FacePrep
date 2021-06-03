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
public class PrimeNumbers {
    public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean check = false;
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        check=true;
      }
    }
    if(check==true)
      System.out.println("Given number is not a prime number");
    else
      System.out.println("Given number is a prime number");
  }
}
