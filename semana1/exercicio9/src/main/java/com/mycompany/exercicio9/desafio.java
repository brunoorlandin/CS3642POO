/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9;



/**
 *
 * @author BRUNOVALLONEORLANDIN
 */
public class desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int solucao = 0;
        
        int cat1, cat2, hip;

        for(hip = 1; hip <= 500; hip++) {
            for(cat1 = 1; cat1 <= 500; cat1++) {
                for(cat2 = 1; cat2 <= 500; cat2++) {
                    if(cat1 * cat1 + cat2 * cat2 == hip * hip) {
                        solucao++;
                    } else if(cat1 * cat1 + cat2 * cat2 > hip * hip) {
                        break;
                    }
                }
            }
        }
        System.out.println("N° de possibilidades: " + solucao/2);
    }
}

    

