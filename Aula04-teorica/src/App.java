public class App {
    public static void main(String[] args) {
        // Declara e instancia um objeto caneta
        Caneta c1 = new Caneta();
        c1.iniciarCaneta("Azul", "BIC", 1.0);

        Caneta c2 = new Caneta();
        c2.iniciarCaneta("Vermelho", "Stabillo", 0.4);


        c1.escrever("Ola mundo! O batman novo é um bom filme.");
        c2.escrever("Missão impossível pode mesmo ser o homem de ferro?");


    }
}
