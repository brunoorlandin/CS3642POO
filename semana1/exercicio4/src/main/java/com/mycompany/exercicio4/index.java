/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio4;

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
        double n;
        for(int i = 0; i < 20; i++) {
            System.out.println("Digite um numero: ");
            n = input.nextDouble();
            
            if (n > 0) {
                System.out.println(n + "\n");
            }
        }
    }
}
