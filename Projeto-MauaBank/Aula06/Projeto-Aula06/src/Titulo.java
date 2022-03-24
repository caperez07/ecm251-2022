import java.time.LocalDate;

public class Titulo {
    private double valor;
    private LocalDate data;
    private double MultaDiaria;

    //Construtor
    public Titulo(double valor, LocalDate data, 
    double MultaDiaria){
        this.valor = valor;
        this.data = data;
        this.MultaDiaria = MultaDiaria;

    }
    public double getMultaDiaria() {
        return MultaDiaria;
    }
    public LocalDate getData() {
        return data;
    }
    public double getvalor() {
        return valor;
    }
}
