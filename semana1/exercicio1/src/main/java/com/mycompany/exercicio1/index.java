/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

/**
 *
 * @author BRUNOVALLONEORLANDIN
 */

import java.util.Scanner;

public class index {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
       double n1, n2, n3;
       
       System.out.println("Entre com o 1 numero:");
       n1 = input.nextInt();
       
       System.out.println("Entre com o 1 numero:");
       n2 = input.nextInt();
       
       System.out.println("Entre com o 1 numero:");
       n3 = input.nextInt();
       
        System.out.println("Produto:" + (n1 * n2 * n3));
    }
}
