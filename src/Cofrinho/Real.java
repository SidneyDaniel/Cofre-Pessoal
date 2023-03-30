package Cofrinho;

public class Real extends Moeda {

    public Real(double valorA){
      this.valor = valorA;  
    }

    public void info() {
        System.out.println("Real - " + valor);
        
    }


    public double converter() {
        return this.valor;   
    }

    
    public boolean equals(Object objeto){
        if(this.getClass() != objeto.getClass()){
            return false;
        }

        Real obejReal= (Real) objeto;

        if (this.valor != obejReal.valor) {
            return false;
        }

        return true;
    }
    
}
