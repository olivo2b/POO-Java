/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner; 

/**
 *
 * @author Aflokkat
 */
public class JavaApplication2 {

    
    public static double epargne (double a)
    {
      double capital = 200; 
       for (double i =1; i<=a;  i++)
       {
         capital = capital*1.02 ; 
         System.out.println(capital);
         
       }
   return capital; 
    }
    public static int facto(int a)
    {
        int b = 1; 
        for (int i = 1;  i<=a;  i++)
        {
            b = b*i; 
        }
        return b; 
    } 
    
    public static void rectangle(int n)
    {
        String s = ""; 
        for (int i =0; i<=n; i++)
        {
            s = s + "*"; 
            System.out.println(s); 
                    
        }
    }
    
     public static void lea(int n)
     {
         int epargne  = 200; 
          
         for (int i = 0;i<=n; i++)
         {
           epargne = epargne + (i*2); 
        System.out.println(epargne);
         }
         
     }
    
     public static void parite(int n)
     {
         if (n%2 ==0)
                 {
                     System.out.println("yes");
                 }
         else 
                 {
                     System.out.println("non");
                             }
                 }
     
     public static void password(int a)
     {
        
         Scanner input=new Scanner(System.in); 
         int n= input.nextInt(); 
         if (n == a)
                 {
                     System.out.println("yes");
                 }
         else
         {
             System.out.println("no");
         }
     }
     
    public static void main(String[] args) {
       
   password(12345);
    
  
}
}