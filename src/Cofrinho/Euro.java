package Cofrinho;

public class Euro extends Moeda {

    public Euro(double valorA){
        this.valor = valorA;  
    }

    public void info() {
        System.out.println("Euro - " + valor);
        
    }

    
    public double converter() {
        return this.valor * 5.50;
    }
    
    public boolean equals(Object objeto){
        if(this.getClass() != objeto.getClass()){
            return false;
        }

        Euro obejEuro= (Euro) objeto;

        if (this.valor != obejEuro.valor) {
            return false;
        }

        return true;
    }
}

//https://www.devmedia.com.br/sobrescrevendo-o-metodo-equals-em-java/26484#:~:text=O%20método%20equals%20é%20utilizado,conteúdo%2C%20possam%20ser%20considerados%20iguais.//