/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
public class Triangle {
      
    public static void area(int a,int b,int c){
        double p=(a+b+c)/2;
        double ar=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(ar);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       
        area(a, b, c);
    }
    
}
