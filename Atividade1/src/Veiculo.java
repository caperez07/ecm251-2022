//Carolina Perez
//RA: 20.00968-2


import java.util.concurrent.ThreadLocalRandom;

public class Veiculo {
    protected int id;
    private String tipo;
    private int preco;

    public Veiculo(int preco, String tipo) {
        this.preco = preco;
        this.tipo = tipo;
        GerarID();
    }

    public int getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    // Testar
    public void testar(){
        System.out.println("ID: " + id + ", custo de aluguel (por hora): " + preco);
    }

    public void GerarID(){
        this.id = ThreadLocalRandom.current().nextInt(10000,100000);
    }


    @Override
    public String toString() {
        return "Veiculo [preco = " + preco + ", id = " + id + ", tipo = " + tipo + "]";
    }


}