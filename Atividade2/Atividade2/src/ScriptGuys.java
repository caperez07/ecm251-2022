//Carolina Perez
//RA: 20.00968-2

public class ScriptGuys extends Membros {
    
    public ScriptGuys(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
        
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
        
    }

   
    @Override
    public void mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("Prazer em ajudar novos amigos de código!");
                break;
            case EXTRA:
                System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
        }
        
    }
}
