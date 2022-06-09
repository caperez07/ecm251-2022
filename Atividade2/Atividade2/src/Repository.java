//Carolina Perez
//RA: 20.00968-2

import java.util.ArrayList;

public class Repository implements Repositorio {
    private ArrayList<Membros> listaMembros = new ArrayList<Membros>();

    
    @Override
    public void adicionarMembro(Membros membro) {
        this.listaMembros.add(membro);

    }

    @Override
    public void removerMembros(Membros membro) {
        this.listaMembros.remove(membro);

    }

    @Override
    public ArrayList<Membros> getMembros() {

        return listaMembros;
    }

}
