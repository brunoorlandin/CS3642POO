/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5;

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
        
        double total = 0;
        int produto;
        
        System.out.println("Digite o numero do produto ou 0 para sair: ");
        produto = input.nextInt();
        
        while (produto != 0) {
            System.out.println("Digite a quantidade: ");
            int quantidade = input.nextInt();
            switch(produto) {
                case 1:
                    total = total + 2.98 * quantidade;
                    break;
                case 2:
                    total = total + 4.50 * quantidade;
                    break;
                case 3:
                    total = total + 3.98 * quantidade;
                    break;
                case 4:
                    total = total + 4.49 * quantidade;
                    break;
                case 5:
                    total = total + 6.87 * quantidade;
                    break;
                default:
                    System.out.println("Produto nao cadastrado");
            }
            System.out.println("Digite o numero do produto ou 0 para sair: ");
            produto = input.nextInt();
        }
        System.out.println("Total de vendas: " + total);
    }
    
}
