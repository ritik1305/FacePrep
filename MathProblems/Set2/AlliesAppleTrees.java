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
public class AlliesAppleTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();        
        for(int i=1;;i++){
            int perimeter = (i+i)*4;
            int apples = perimeter+(perimeter/4);
            if(apples>=x){
                System.out.println(apples);
                break;
            }
        }        
    }
}
