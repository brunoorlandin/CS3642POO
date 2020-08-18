/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio2;

/**
 *
 * @author BRUNOVALLONEORLANDIN
 */

import java.util.Scanner;

public class index {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, aux;
        
        System.out.println("Entre com o 1 numero:");
        a = input.nextInt();
        
        System.out.println("Entre com o 2 numero:");
        b = input.nextInt();
        
        System.out.println("Entre com o 3 numero:");
        c = input.nextInt();
        
        if (a > b){
            aux = a;
            a = b;
            b = aux;
        }
        
        if (b > c){
            aux = b;
            b = c;
            c = aux;
        }
        
        if (a > b){
            aux = a;
            a = b;
            b = aux;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
