/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;
/**
 *
 * @author M. Usama
 */
public class JavaApplication28 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       for(int i=0; i<6; i++) /*outer loop */
       {
           for(int j=0; j<i; j++) /* inner loop*/
           {
              if(i==0)
              {
                System.out.print("a");
                break;
              }
              else if(i==1)
              {
                System.out.print("a h");
                break;
              }
              else if(i==2)
              {
                 System.out.print("a h m");
                 break;
              }
              else if(i==3)
              {
                 System.out.print("a h m a");
                 break;
              }
              else if(i==4)
              {
                  System.out.print("a h m a d");
                  break;
              }
           }
           System.out.println();
       }
    }
}