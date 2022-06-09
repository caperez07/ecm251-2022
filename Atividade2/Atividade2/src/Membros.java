//Carolina Perez
//RA: 20.00968-2

public abstract class Membros implements Apresentacao, PostarMensagem {


    private String email;
    private String nome;
    private Funcoes funcao;

    public Membros(String email, String nome, Funcoes funcao) {
        this.email = email;
        this.nome = nome;
        this.funcao = funcao;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public Funcoes getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcoes funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Membro " + nome + ",\n Funçao = " + funcao + "\n E-mail = " + email + "";
    }
}
