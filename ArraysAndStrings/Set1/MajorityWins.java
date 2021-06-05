/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacePrep.ArraysAndStrings.Set1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ritik
 */
public class MajorityWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-->0){
        boolean check=false;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<n;i++){
            
            if(arr[i-1] == arr[i]){
                count++;
                if(count>n/2){
                  	check=true;
                    System.out.println(arr[i-1]);
                    break;
                }
            }else{
                if(count>n/2){
                  	check=true;
                    System.out.println(arr[i-1]);
                    break;
                }else{
                    count=1;
                }
            }
        }        
          if(check==false)
          	System.out.println(-1);
    }
  }
}
