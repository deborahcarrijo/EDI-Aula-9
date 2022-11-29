/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problemajosephus;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class ProblemaJosephus {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        int numero = 0;
        int posicao;
        int chave;

        Pessoa p1 = new Pessoa("Ana", "(64)7777-8888", "Rua A, nº 1", "123.456.789-10");
        Pessoa p2 = new Pessoa("Bia","(64)8888-9999", "Rua B, nº 2", "234.567.891-01");
        Pessoa p3 = new Pessoa("Carlos","(64)9999-0000", "Rua C, nº 3", "345.678.910-12");
        Pessoa p4 = new Pessoa("Dora","(64)0000-0000", "Rua D, nº 4", "456.789.101-23");
        Pessoa p5 = new Pessoa("Erik","(64)1111-1111", "Rua E, nº 5", "567.891.012-34");
        Pessoa p6 = new Pessoa("Flávio", "(64)2222-2222", "Rua A, nº 1", "678.910.123-45");
        Pessoa p7 = new Pessoa("Gean","(64)3333-3333", "Rua B, nº 2", "789.101.234-56");
        Pessoa p8 = new Pessoa("Helena","(64)4444-4444", "Rua C, nº 3", "891.012.345-67");
        Pessoa p9 = new Pessoa("Igor","(64)5555-5555", "Rua D, nº 4", "910.123.456-78");
        Pessoa p10 = new Pessoa("Júlia","(64)6666-6666", "Rua E, nº 5", "101.234.567-89");
        Pessoa p11 = new Pessoa("Kaio", "(64)7777-7777", "Rua A, nº 1", "012.345.678-91");
        Pessoa p12 = new Pessoa("Laura","(64)8888-8888", "Rua B, nº 2", "109.876.543-21");
        Pessoa p13 = new Pessoa("Maria","(64)9999-9999", "Rua C, nº 3", "098.765.432-11");
        Pessoa p14 = new Pessoa("Nadir","(64)0000-1111", "Rua D, nº 4", "987.654.321-10");
        Pessoa p15 = new Pessoa("Olivia","(64)1111-2222", "Rua E, nº 5", "876.543.211-09");
        Pessoa p16 = new Pessoa("Paulo", "(64)2222-3333", "Rua A, nº 1", "765.432.110-98");
        Pessoa p17 = new Pessoa("Queila","(64)3333-4444", "Rua B, nº 2", "654.321.109-87");
        Pessoa p18 = new Pessoa("Rosa","(64)4444-5555", "Rua C, nº 3", "543.211.098-76");
        Pessoa p19 = new Pessoa("Silvio","(64)5555-6666", "Rua D, nº 4", "432.110.987-65");
        Pessoa p20 = new Pessoa("Túlio","(64)6666-7777", "Rua E, nº 5", "321.109.876-54");

        lista.adicionaNoFinal(p1);
        lista.adicionaNoFinal(p2);
        lista.adicionaNoFinal(p3);
        lista.adicionaNoFinal(p4);
        lista.adicionaNoFinal(p5);
        lista.adicionaNoFinal(p6);
        lista.adicionaNoFinal(p7);
        lista.adicionaNoFinal(p8);
        lista.adicionaNoFinal(p9);
        lista.adicionaNoFinal(p10);
        lista.adicionaNoFinal(p11);
        lista.adicionaNoFinal(p12);
        lista.adicionaNoFinal(p13);
        lista.adicionaNoFinal(p14);
        lista.adicionaNoFinal(p15);
        lista.adicionaNoFinal(p16);
        lista.adicionaNoFinal(p17);
        lista.adicionaNoFinal(p18);
        lista.adicionaNoFinal(p19);
        lista.adicionaNoFinal(p20);
        
        Pessoa atual;
        
        for(int i = 0; i < lista.tamanho(); i++){
            atual = (Pessoa)lista.pega(i);
            System.out.println("Número da pessoa: " + (i + 1));
            lista.imprimir(atual);
        }
        
        System.out.println("\n---------------------------------------");
        
        for(int i = 0; i < 20; i++){
            
            chave = Integer.parseInt(JOptionPane.showInputDialog("Digite um número chave de 1 a 20: "));

            while(chave < 1 || chave > 20){
                chave = Integer.parseInt(JOptionPane.showInputDialog("Chave inválida!\nDigite um número chave de 1 a 20: "));
            }
            
            if (lista.tamanho() == 1){
                atual = (Pessoa)lista.pega(0);
                System.out.println("A pessoa sobrevivente foi: ");
                lista.imprimir(atual);
            }else{
                posicao = (numero + chave - 1) % lista.tamanho();
                numero = posicao;
                atual = (Pessoa)lista.pega(posicao);
                System.out.println("Pessoa removida da posição " + posicao);
                lista.imprimir(atual); 
                lista.remove(posicao);   
            }
        }
    }
}
