/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemajosephus;

/**
 *
 * @author deborah
 */
public class ListaLigada {
    Celula primeira;
    Celula ultima;
    int totalDeElementos;
    
    void adicionaNoComeco(Object elemento){ 
        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;
        
        if(this.totalDeElementos == 0){ // caso especial da lista vazia
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }
    
    void adicionaNoFinal(Object elemento){
        if(this.totalDeElementos == 0){
            this.adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    public boolean posicaoOcupada(int posicao){
        return((posicao >= 0)&&(posicao < this.totalDeElementos));
    }
    
    public Celula pegaCelula(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao nao Existe!!!");
        }else{
            Celula atual = this.primeira;
            for(int i = 0; i < posicao; i++){
                atual = atual.getProxima();
            }
            return(atual);
        }
    }
    
    public void adiciona(int posicao, Object elemento) {
        if(posicao == 0){ // No começo.
            this.adicionaNoComeco(elemento);
        } else if(posicao == this.totalDeElementos){ // No fim.
            this.adicionaNoFinal(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
    }
       
    public Object pega(int posicao){
        return(this.pegaCelula(posicao).getElemento());
    }
    
    public void removeDoComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posicao nao Existe");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalDeElementos--;
            
            if(this.totalDeElementos == 0){
                this.ultima = null;
            }     
        }
    }
    
    public void removeDoFim() {
        if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        if (this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            Celula penultima = this.pegaCelula(this.totalDeElementos - 2);
            penultima.setProxima(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
    }
    
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        
        if (posicao == 0) {
            this.removeDoComeco();
        } else if (posicao == this.totalDeElementos - 1) {
            this.removeDoFim();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            anterior.setProxima(atual.getProxima());
            
            if(atual.getProxima() == null){
                this.ultima = anterior;
            }
            this.totalDeElementos--;
        }
    }
    
    public int tamanho(){
        return(this.totalDeElementos);
    }
    
    void imprimir(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Telefone: " + pessoa.telefone);
        System.out.println("Endereço: " + pessoa.endereco);
        System.out.println("CPF: " + pessoa.CPF);
        System.out.println("---------------------------------------");
    }
}
