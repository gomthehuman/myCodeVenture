/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gomolemo
 */
import java.util.Scanner;
public class Fibo {
    public static void main(String args []){
    int F;
    int x = 1;
    int y = 1;
    Scanner gom = new Scanner(System.in);
    System.out.println("Enter Your Number: ");
    int n = gom.nextInt();
    System.out.print("0 ");
    System.out.print(x);
    System.out.print(" ");
    System.out.print(y);
    System.out.print(" ");
    do{
      F = x + y;
      if(F>=n){
      break;
      }
      System.out.print(F + " ");
      x = y;
      y = F;
      
    }while (F<=n);
    
    }
}
