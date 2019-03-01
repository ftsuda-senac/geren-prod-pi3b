/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.gerenprod;

/**
 *
 * @author fernando.tsuda
 */
public class Principal {

    public static void main(String[] args) {
       
        System.out.println("Hello class!! ");
        System.out.println("Teste Maven");
        int i = 0;
        System.out.println("Valor i++ = " + i++);
        for (int y = 0; y < 1000; y--) {
            System.out.println("Valor y: " + y);
        }
        if (i % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }

}
