package Cofrinho;

import java.util.Scanner;

public class menu {

    public Scanner teclaApertada; 
    public cofre Cofre;

    public menu(){
        teclaApertada = new Scanner(System.in);
        Cofre = new cofre();
    }

    
     public void menuPrincipal(){
        // Menu do Principal do Programa

      System.out.println(
      "-----------------------------------------" + "\n" + 
      "----------------COFRE PESSOAL------------" + "\n" +
      "-----------------------------------------" + "\n" +
      "Escolha uma das opções abaixo: " + "\n" +
      "[1] Adicione uma moeda" + "\n" + 
      "[2] Remover uma moeda" + "\n" + 
      "[3] Listar moedas" + "\n" +
      "[4] Calcule o valor total convertido" + "\n"+
      "[0] Encerrar Programa"+ "\n"+
      "-----------------------------------------");
    
      String opcaoEscolhida = teclaApertada.next();      

      switch(opcaoEscolhida){  
        case "1":
            System.out.println("Esolha uma moeda:"+ "\n" +
            "[1] Real" + "\n" + 
            "[2] Dólar" + "\n" + 
            "[3] Euro" +"\n" +
            "[4] VOLTAR"
            );
            
            int moedaEscolhida = teclaApertada.nextInt();
            System.out.println("Digite um valor:");
            
            String valorTexto = teclaApertada.next();

            valorTexto = valorTexto.replace(",", ".");
            double valorDigitado = Double.valueOf(valorTexto);

            System.out.println("O valor digitado é " + valorDigitado);
            

           Moeda moeda = null; 
           if (moedaEscolhida == 1) {
                moeda = new Real(valorDigitado);
                

           } else if(moedaEscolhida == 2){
                moeda = new Dolar(valorDigitado);
                

           }else if(moedaEscolhida == 3){
                moeda = new Euro(valorDigitado);
                
           }else{ 
                System.out.println("Moeda inexistente!");
                menuPrincipal();
           };
           Cofre.adicionar(moeda);



            menuPrincipal();
            break; 

        case "2":
            removerMoedaDoCofre();
            System.out.println("Moeda removida!");
            menuPrincipal();
            break;  

            // Listar as moedas presentes no cofre//
        case "3":
            Cofre.listarAsMoedas();
            menuPrincipal();
            break;  
            // Soma e conversão e conversão das moedas Euro e Dólar para Real.//

        case "4":
            double valorConvertido = Cofre.valorConvertido();
            System.out.println("Valor total Convertido para Real: R$"+ valorConvertido);
            menuPrincipal();
            break;  

            // Encerrar o programa //
        case "0":
            System.out.println("Encerrando o programa....");
            break;  

            // Qualquer valor invalido irá resultar no default do switch, assim reiniciando o processo//
        default:
            System.out.println("Invalido, tente novamente!");
            menuPrincipal(); //invocação do menu principal novamente//
            
         
      }
 
    }


    //Não é possível repetir a variável 'moeda' dentro do switch em, //
    //diferentes cases, porém se criar um método é possível utilizar // 
    //o mesmo várias vezes.                                          //

    public void removerMoedaDoCofre(){
        System.out.println("Esolha uma moeda para remover:"+ "\n" +
        "[1] Real" + "\n" + 
        "[2] Dólar" + "\n" + 
        "[3] Euro" +"\n" +
        "[4] VOLTAR"
        );
        
        int moedaEscolhida = teclaApertada.nextInt();
        System.out.println("Digite o valor:");
        
        String valorTexto = teclaApertada.next();

        valorTexto = valorTexto.replace(",", "."); //caso o usuário escreva o valor com ',', está linha converte a mesma para '.'//
        double valorDigitado = Double.valueOf(valorTexto);

        System.out.println("O valor digitado é " + valorDigitado);
        

       Moeda moeda = null; 
       if (moedaEscolhida == 1) {
            moeda = new Real(valorDigitado);
            

       } else if(moedaEscolhida == 2){
            moeda = new Dolar(valorDigitado);
            

       }else if(moedaEscolhida == 3){
            moeda = new Euro(valorDigitado);
            
       }else{ 
            System.out.println("Moeda inexistente!");
            menuPrincipal();
       };
       Cofre.remover(moeda);
       

    }



}
