/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio6;

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
        
        int P, R;
        
        System.out.println("Digite a posicao da porta P: ");
        P = input.nextInt();
        
        System.out.println("Digite a posicao da porta R: ");
        R = input.nextInt();
        
        if (P == 1 && R == 1){
            System.out.println("A");
        }
        
        if (P == 1 && R == 0){
            System.out.println("B");
        }
        
        if (P == 0){
            System.out.println("C");
        }
    }
}
