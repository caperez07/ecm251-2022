//Carolina Perez
//RA: 20.00968-2

public class BigBrothers extends Membros {
   
    public BigBrothers(String email, String nome, Funcoes funcao) {
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
                System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                break;
            case EXTRA:
                System.out.println("...");
                break;
        }
        
    }

    
}
