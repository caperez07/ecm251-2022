public class App {
    public static void main(String[] args){ 
        //Declara e instancia um objeto caneta
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "azul";
        c1.carga = 100;
        c1.ponta = 1.0;
        System.out.println("Minha Caneta: "+c1.modelo);
        System.out.println("Minha Caneta: "+c1.cor);
        System.out.println("Minha Caneta: "+c1.carga);
        System.out.println("Minha Caneta: "+c1.ponta);


    }
}
