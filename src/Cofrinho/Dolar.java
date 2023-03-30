package Cofrinho;

public class Dolar extends  Moeda{

    public Dolar(double valorA){
        this.valor = valorA;  
    }

    public void info() {
        System.out.println("Dolar - " + valor);
        
    }

    
    public double converter() {  
        return this.valor * 5.30;
    }

    public boolean equals(Object objeto){
        if(this.getClass() != objeto.getClass()){
            return false;
        }

        Dolar obejDolar= (Dolar) objeto;

        if (this.valor != obejDolar.valor) {
            return false;
        }

        return true;
    }
    
}
