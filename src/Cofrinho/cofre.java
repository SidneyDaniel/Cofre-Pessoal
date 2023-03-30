package Cofrinho;

import java.util.ArrayList;

public class cofre {
    private ArrayList<Moeda>listaMoeda;

    public cofre(){
        this.listaMoeda = new ArrayList<>();
    }

    public void adicionar(Moeda moeda){
        this.listaMoeda.add(moeda);
    }

    public void remover(Moeda moeda){
        this.listaMoeda.remove(moeda);
    }
    
    public void listarAsMoedas(){
        if(this.listaMoeda.isEmpty()){
            System.out.println("O cofre está vazio...");
            return;
            
        }
        for (Moeda moeda:this.listaMoeda){
            moeda.info();
            
        }
    }

    public double valorConvertido(){ 
       
        //caso a lista de moedas esteja vazia ela não retorna nada//
        if(this.listaMoeda.isEmpty()){
            return 0;
        }
        // contador onde as moedas são guardadas para serem chamadas pelo lista moedas//
        double moedasGuardadaa = 0;

        for(Moeda moeda:this.listaMoeda){
            moedasGuardadaa = moedasGuardadaa + moeda.converter();
        }

        return moedasGuardadaa;
        
    }

    
}
