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
public class AzadAndChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            
            int flag=0;
            for(int i=0;i<100/7;i++)
            for(int j=0;j<100/3;j++)
            if(n+i*7+j*3==100)
            {
	      flag=1;
            }
            System.out.println(flag);            
        }        
    }
}
