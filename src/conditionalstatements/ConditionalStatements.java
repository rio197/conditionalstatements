/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements;

import java.util.Scanner;

/**
 *
 * @author rio197
 */
public class ConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a number between 1 and 5");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        
        if (a == 1) {
            System.out.println("One");
        }
        
        else if (a == 2) {
            System.out.println("Two");
        }
        
        else if (a == 3) {
            System.out.println("Three");
        }
        
        else if (a == 4) {
            System.out.println("Four");
        }
        
        else if (a == 5) {
            System.out.println("Five");
        }
        
        else {
            System.out.println("Wrong Input");
        }
    }    
}
