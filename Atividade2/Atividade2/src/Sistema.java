//Carolina Perez
//RA: 20.00968-2

import java.util.Scanner;

public class Sistema {
    
    final private static Menu menu = new Menu();
    final protected static Repositorio repository = new Repository();
    final private static Scanner scanner = new Scanner(System.in);
    private static Horarios horarioTrabalho = Horarios.NORMAL;


    public static void run() throws Exception {

        boolean rodar = true;
        
        System.out.println("Seja bem Vindo(a) ao MAsK_S0c13ty");

        while (rodar) {
            menu.exibirMenuSistema(horarioTrabalho);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Membros membro = cadastrarMembro();
                    if (membro != null) {
                        repository.adicionarMembro(membro);    
                    }
                    break;

                case 2:
                    for (Membros membros : repository.getMembros()) {
                        membros.apresentar();
                    }
                    break;

                case 3:
                    for (int i = 0; i < repository.getMembros().size(); i++) {
                        System.out.print("[" + (i + 1) + "]" + " ");
                        repository.getMembros().get(i).apresentar();
                        
                    }
                    System.out.println("Digite o índice do membro a ser removido:");
                    int indice = scanner.nextInt();
                    repository.removerMembros(repository.getMembros().get(indice - 1));
                    break;

                case 4:
                    switch (horarioTrabalho) {
                        case NORMAL:
                        horarioTrabalho = Horarios.EXTRA;
                            break;

                        case EXTRA:
                        horarioTrabalho = Horarios.NORMAL;
                            break;
                        default:
                            break;

                    }
                    break;

                case 5:
                    for (Membros membros : repository.getMembros()) {
                        membros.mensagem(horarioTrabalho);
                    }
                    break;

                case 9:
                    System.out.println("\nSaindo do sistema.");
                    rodar = false;
                    break;

                default:
                    break;
            }
        }
    }


    private static Membros cadastrarMembro() {
        menu.exibirMenuCadastro();

        int opcaoMembro = scanner.nextInt();
        System.out.println("Digite o nome do membro: ");
        String nome = scanner.next();

        System.out.println("Digite o email do membro: ");
        String email = scanner.next();
        switch (opcaoMembro) {

            case 1:
                return new MobileMembers(email, nome, Funcoes.MobileMembers);

            case 2:
                return new HeavyLifters(email, nome, Funcoes.HeavyLifters);

            case 3:
                return new ScriptGuys(email, nome, Funcoes.ScriptGuys);

            case 4:
                return new BigBrothers(email, nome, Funcoes.BigBrothers);

            case 9:
                return null;

            default:
                System.out.println("Opção inválida!");
                return null;
        }
    }

}
