//Carolina Perez
//RA: 20.00968-2

public class MobileMembers extends Membros {

public MobileMembers(String email, String nome, Funcoes funcao) {
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
            System.out.println("HappyCoding!");
            break;
        case EXTRA:
            System.out.println("MAsK_S0c13ty");
            break;
    }
    
}

}