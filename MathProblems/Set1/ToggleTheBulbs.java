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
public class ToggleTheBulbs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bulbs[] = new boolean[n+1];
        
        for(int i=1;i<=n;i++){
            bulbs[i]=false;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(j%i==0){
                    bulbs[j]=!bulbs[j];
                }
            }
        }
        int s=0;
        for(int i=1;i<=n;i++){
            if(bulbs[i]==true){
                s+=1;
            }
        }
        System.out.println(s);
    }
}
