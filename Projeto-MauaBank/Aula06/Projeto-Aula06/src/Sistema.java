import java.time.LocalDate;

import java.time.LocalDate;

public class Sistema {
    public void run(){
        Cliente cliente = new Cliente("Mindoria", "123456", "allmight_wannabe@gmail.com");
        Conta conta = new Conta(cliente, 1234);
        
        System.out.println(conta);

        Titulo steam = new Titulo(200, LocalDate.of(2022,03,30), 5);
        
        conta.depositar(300);
    }

    boolean pagarTitulo(Titulo titulo, Conta conta){
        double valorPagar
        LocalDate dataTitulo = titulo.getData();
        LocalDate hoje =LocalDate.now();
        if(dataTitulo.compareTo(hoje) > 0){
            valorPagar = titulo.getvalor();
        }
         else{
             //TO DO: terminar implementação
        }
        return true;
    }
}
