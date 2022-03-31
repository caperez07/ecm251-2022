//Carolina Perez RA:20.00968-2

package SimuladoAtividade1;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public void visualizarUsuario(){
        System.out.println("Dados do Usuario:");
        System.out.println("Nome:" + nome);
        System.out.println("E-mail:" + email);
        System.out.println("Senha:" + senha);
        
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getsenha(){
        return senha;
    }
    public void setsenha(String senha){
        this.senha = senha;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    

}