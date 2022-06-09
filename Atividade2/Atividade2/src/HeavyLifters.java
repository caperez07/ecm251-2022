//Carolina Perez
//RA: 20.00968-2

public class HeavyLifters extends Membros {
    
    public HeavyLifters(String email, String nome, Funcoes funcao) {
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
                System.out.println("Podem contar conosco!");
                break;
            case EXTRA:
                System.out.println("N00b_qu3_n_Se_r3pita.bat");
                break;
        }
       
        
    }
}
