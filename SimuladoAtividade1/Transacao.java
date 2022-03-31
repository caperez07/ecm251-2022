//Carolina Perez RA:20.00968-2

package SimuladoAtividade1;

public class Transacao {
    private String texto;
    private double valor;
    private static int contador = 0;

    public Transacao(String texto, double valor){
        this.texto = texto;
        this.valor = valor;
        contador += 1;
    }

    public String toString(){
        return "{texto:" + this.texto
        + "\n valor:" + this.valor 
        + "\n contador:" + contador + "}";
    }

    public static int getContador(){
        return contador;
    }
}
