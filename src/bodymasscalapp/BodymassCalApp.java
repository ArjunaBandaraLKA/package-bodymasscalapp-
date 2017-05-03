/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymasscalapp;

import java.util.Scanner;

/**
 *
 * @author Arjuna
 */
public class BodymassCalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double weight,height,mindex;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight in Kg");
        weight = in.nextDouble();
        
        System.out.println("Enter height in Meter");
        height = in.nextDouble();
        
        mindex = weight/(height*height) ;
       
        
        System.out.println("Body mass index " + mindex );
    
    }
    
}
