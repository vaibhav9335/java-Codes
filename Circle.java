/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author vaibhav
 */
public class Circle {

  private double radius=1.0;
  private String color="red";

    public Circle() {
    }
    public Circle(double radius){
        //this();
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
            
    public double getArea(){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
       Circle c=new Circle(r);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
    
}
