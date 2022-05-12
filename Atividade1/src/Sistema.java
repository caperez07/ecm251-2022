//Carolina Perez
//RA: 20.00968-2



public class Sistema {
    public static void executar(){
        Carro carro1 = new Carro(3000, "Ford Ka");
        Carro carro2 = new Carro(6000, "Mercedes Benz");
        Moto moto1 = new Moto(1000, "Motor");
        Moto moto2 = new Moto(1500, "Toyota");
        Bicicleta bike1 = new Bicicleta(600, "Pinarello");
        Bicicleta bike2 = new Bicicleta(750, "Caloi");
        Patinete patinete1 = new Patinete(450, "Scooter");
        Patinete patinete2 = new Patinete(500, "Atrio");


        Usuario usuario1 = new Usuario("Carolina");
        Usuario usuario2 = new Usuario("Julia");
        Usuario usuario3 = new Usuario("Clotilde");
        Usuario usuario4 = new Usuario("Roseli");
        Usuario usuario5 = new Usuario("Bulba");
        Usuario usuario6 = new Usuario("Veridiana");
        Usuario usuario7 = new Usuario("Carminha");
        Usuario usuario8 = new Usuario("Laura");


        System.out.println(" Aluguel 1: ");
        usuario1.alugar(carro1);
        System.out.println(carro1);
        System.out.println(usuario1);

        System.out.println(" Aluguel 2: ");
        usuario1.alugar(carro2);
        System.out.println(carro2);
        System.out.println(usuario8);

        System.out.println(" Aluguel 3: ");
        usuario1.alugar(moto1);
        System.out.println(moto1);
        System.out.println(usuario6);

        System.out.println(" Aluguel 4: ");
        usuario1.alugar(moto2);
        System.out.println(moto2);
        System.out.println(usuario2);

        System.out.println(" Aluguel 5: ");
        usuario1.alugar(bike1);
        System.out.println(bike1);
        System.out.println(usuario4);

        System.out.println(" Aluguel 6: ");
        usuario1.alugar(bike2);
        System.out.println(bike2);
        System.out.println(usuario3);

        System.out.println(" Aluguel 7: ");
        usuario1.alugar(patinete1);
        System.out.println(patinete1);
        System.out.println(usuario7);

        System.out.println(" Aluguel 8: ");
        usuario1.alugar(patinete2);
        System.out.println(patinete2);
        System.out.println(usuario5);

    }

   



}
