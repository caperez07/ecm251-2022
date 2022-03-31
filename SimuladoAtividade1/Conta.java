//Carolina Perez RA:20.00968-2

package SimuladoAtividade1;

public class Conta {
    //Atributos da nossa classe
    private int id;
    private double saldo;
    private Usuario usuario;

   //Construtor
    public Conta(Usuario usuario, int id){
        this.id = id;
        this.usuario = usuario;
        saldo = 0;
    }

    //Métodos da classe
    public String visualizarSaldo(){
        return String.format("R$ %.2f", saldo); 
    }
    public boolean depositar(double valor){
        if(valor < 0) 
            return false;
        this.saldo += valor;
        return true;
    }
    public boolean sacar(double valor){
        if(valor > saldo) return false;
        if(valor < 0) return false;
        this.saldo -= valor;
        return true;
    }
    public boolean transferirDinheiro(double valor, Conta destino){
        if(!sacar(valor)) return false;
        if(!destino.depositar(valor)) return false;
        return true;
    }
    public String toString (){
        return "Conta Numero:" + id +
        "\n Saldo:" + visualizarSaldo() +
        "\n Usuario:" + usuario.getNome();
    }
}