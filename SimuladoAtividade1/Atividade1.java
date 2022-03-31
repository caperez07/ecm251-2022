//Carolina Perez RA:20.00968-2

package SimuladoAtividade1;

//import java.time.LocalDate;

//import java.time.LocalDate;

public class Atividade1 {
    public void run(){
        Usuario usuario = new Usuario("Mindoria", "Abc123", "allmight_wannabe@gmail.com");
        Conta conta = new Conta(usuario, 777);
        
        System.out.println(conta);

        Transacao t1 = new Transacao("Squirtle", 777);
        
        conta.depositar(300);
    }

   // boolean pagarQrCode(Titulo titulo, Conta conta){
    //    double valorPagar
    //    LocalDate dataTitulo = titulo.getData();
      //  LocalDate hoje =LocalDate.now();
        //if(dataTitulo.compareTo(hoje) > 0){
          //  valorPagar = titulo.getvalor();
        //}
         //else{
             //TO DO: terminar implementação
       // }
        //return true;
   // }
}
