/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject87;

/**
 *
 * @author NDUVHO
 */import java.util.Scanner;
public class Mavenproject87 {

    public static void main(String[] args) {
  Scanner  input=new Scanner(System.in);
  
  
  int a,b,c,d,e,f;
  
  System.out.println("-");
  a=input.nextInt();
  System.out.println("-");
    b=input.nextInt();
    
    c=a+b;
    d=a-b;
    e=a*b;
    f=a/b;
    
    System.out.println("ADDITION= " +c);
         System.out.println("substraction= " +d);
             System.out.println("multiplication= " +e);
        System.out.println("modulus= " +f);
  
    }
}
