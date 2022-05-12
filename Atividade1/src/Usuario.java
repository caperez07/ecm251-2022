//Carolina Perez
//RA: 20.00968-2

public class Usuario {
private String nome;
private Veiculo veiculo;

public Usuario(String nome) {
    this.nome = nome;

}
    
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}


public Veiculo getVeiculo() {
    return veiculo;
}


public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
}


@Override
public String toString() {
    return "Usuario [nome = " + nome + "]";
}



public void alugar(Veiculo veiculo){
    setVeiculo(veiculo);
}


}


