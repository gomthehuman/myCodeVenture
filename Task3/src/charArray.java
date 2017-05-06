/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gomolemo
 */
public class charArray {
    
   public static void main(String args []){
       char[] star ={'!','@','#','$','%','^','&','*','(',')'};
       for (int i = star.length-1; i >=0 ; i--) {
           System.out.print(star[i] + " ");
       }
       System.out.println("");
       String result="";
       for (int i = star.length-1; i >=0 ; i--) {
           char [] oneChar={star[i],star[i]};
           System.out.print(oneChar);
           System.out.print(" ");
           //result+=oneChar[i] + " ";
           //char[] oneChar={""};
           //oneChar = star[i]+star[i];
           
           
       }
       //System.out.print(result);
       
   }
}
