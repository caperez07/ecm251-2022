public class Caneta {
    // caracteristicas da caneta - seus atributos
    String modelo;
    String cor;
    double ponta;
    int carga;
    final int CARGA_INICIAL = 100;

    // comportamentos da caneta - seus metodos
    void iniciarCaneta(String cor, String modelo, double ponta) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
        this.carga = CARGA_INICIAL;
    }

    void escrever(String texto) {
for (int i = 0; i < texto.length(); i++)
        if(this.carga > 0){
            System.out.print(texto.charAt(i));
            this.carga -= 1;
        } else{
            System.out.print("\n CANETA SEM CARGA!!");
            break;
        

    }
    System.out.println();
}



    String mostrarDados() {
        return "Modelo:" + this.modelo +
                " - Cor:" + this.cor +
                " - Ponta:" + this.ponta +
                " - Carga:" + this.carga;

    }
}
