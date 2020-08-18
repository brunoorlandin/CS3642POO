/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7;

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
        
        double salario = 0, reajuste = 0;
        
        System.out.println("Digite o salario atual: ");
        salario = input.nextDouble();
        
        if (salario > 0 && salario <= 400) {
            reajuste = 0.15 * salario;
        }
        
        else if(salario > 400 && salario <= 800) {
            reajuste = 0.12 * salario;
        }
        
        else if (salario > 800 && salario <= 1200) {
            reajuste = 0.1 * salario;
        }
        
        else if (salario > 1200 && salario <= 2000) {
            reajuste = 0.07 * salario;
        }
        
        else if (salario > 2000){
            reajuste = 0.04 * salario;
        }
        
        else {
            System.out.println("Salario invalido!");
        }
        
        System.out.println("Novo salario: " + (salario + reajuste) + "\nReajuste%: " + ( (reajuste/salario) * 100) + "\nReajuste: R$ " + reajuste);
    }
    
}
