//Carolina Perez
//RA: 20.00968-2

import java.util.ArrayList;

public interface Repositorio {
    void adicionarMembro(Membros membro);
    void removerMembros(Membros membro);
    ArrayList<Membros> getMembros();
}
