/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8;

/**
 *
 * @author BRUNOVALLONEORLANDIN
 */

import java.util.Scanner;

public class index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n;
        int[] num = new int[5];
        
        
        for (int i  = 0; i < 5; i++) {
            while (true) {
                System.out.println("Digite um numero entre 1 e 30: ");
                n = input.nextInt();

                if (n >=1  && n <=30) {
                 break;
                }
                else{
                    System.out.println("Numero invalido!");
                }   
            } 
            num[i] = n;
        }
        for (int j = 0; j < num.length; j++) {
            for (int k = 0; k < num[j]; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
        
        

