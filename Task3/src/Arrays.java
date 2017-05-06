
import java.util.Scanner;

import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gomolemo
 */
public class Arrays {
 
 
    
    /*
    int[] names = new int[5];
    Scanner sc = new Scanner(System.in);
    for(i = 1; i < = 5; i++){
    system.out.println("Enter Name:");
    names[i]= gom.nextLine(); //not sure about this...
    
    //below is some code I got from SO.
    
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[5];

    for (int i = 0; i < numbers.length; i++)
    {
        System.out.println("Please enter number");
        numbers[i] = input.nextDouble();
    
    
    this is how to convert an array to an arrayList: 
    ArrayList<Element> arrayList = new ArrayList<Element>(Arrays.asList(array));
    I think I might need to convert my arrays to arrayLists so I can maipulate them freely, 
    then back to arrays by throwing every element in the array list back to an array.
    }
    */
public static void main(String args []){

 String[] names = new String[5];
String [][] Student = new String[5][2];
int [][] tests = new int [5][2];
Scanner sc = new Scanner(System.in);
int sum = 0;
    for(int i = 0; i <= 2; i++) {
     
        System.out.println("Please enter Student Name: ");
        names[i]=sc.nextLine();
        System.out.println("Enter student age ");
        Student[i][0] = sc.nextLine();
        System.out.println("Enter student year: ");
        Student[i][1] = sc.nextLine();
        
        
       
    }
    //System.out.println("Names "+"Age "+"Year");
    for (int i = 0; i <=2; i++) {
       
            System.out.println(names[i]+" "+Student[i][0]+" "+Student[i][1]);
    }
    
    for (int i = 0; i <= 2; i++) {
        System.out.println("Enter test 1: ");
        tests[i][0] = sc.nextInt();
        System.out.println("Enter test 2: ");
        tests[i][1] = sc.nextInt();
    }
    
    for (int i = 0; i <= tests.length; i++) {
       
        sum=tests[i][0]+tests[i][1];
        int percentage = sum*100/100;
        System.out.println(names[i]+ " " + Student[i][0] + " " + Student[i][1] + " " + percentage );
        //System.out.println(percentage);
    }
 }

}

    
