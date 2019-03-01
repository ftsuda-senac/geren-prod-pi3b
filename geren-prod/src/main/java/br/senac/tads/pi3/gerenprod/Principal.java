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
        ProdutoDAO dao = new ProdutoDAO();
        dao.listar();
    }

}
