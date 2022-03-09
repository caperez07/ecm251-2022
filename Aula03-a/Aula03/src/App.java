import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Carolina");
        System.out.println("Teste");
        System.out.println("Agora Vai!");
        //Ler do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois numeros:");
        double n1, n2;
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        System.out.println("Soma:"+(n1+n2));
    }
}
