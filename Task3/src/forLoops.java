/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gomolemo
 */

public class forLoops {
    
     public static int iterateCount(int loopA, int loopB){
            int firstLoop=0;
            int secondLoop=0;
            int sum=0;
            int product1 = 0;
            int product2 = 0;
         for (int i = 0; i <= loopA; i++) {
             firstLoop=i;
             for (int j = 0; j <= loopB; j++) {
             secondLoop=j; 
             }
  
         }
         sum=firstLoop+secondLoop;
         product1 = firstLoop * sum;
         product2 = secondLoop * sum;
         
        
         
         System.out.print("This is how many times the first loop ran: ");
         System.out.println(firstLoop);
         System.out.print("This is how many times the second loop ran: ");
         System.out.println(secondLoop);
         System.out.print("This is the sum of the two loops: ");
         System.out.println(sum);
         System.out.print("Loop 1 multiplied by the sum of both loops is: ");
         System.out.println(product1);
         System.out.print("Loop 2 multiplied by the sum of both loops is: ");
         System.out.println(product2);
         
         return sum;
       
        }
    public static void main(String [] args){
    
       
   iterateCount(5,10);
    }
}
