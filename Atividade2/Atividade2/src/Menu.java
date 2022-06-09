//Carolina Perez
//RA: 20.00968-2

public class Menu {

    public void exibirMenuSistema(Horarios horarioTrabalho){
        System.out.println(
            "\nMENU DO SISTEMA:" +
            "\n" +
            "Jornada de trabalho atual: " + horarioTrabalho +
            "\nPressione:\n" +
            "1 - Cadastrar novo membro\n" + 
            "2 - Apresentar membros cadastrados\n" + 
            "3 - Remover membro\n" + 
            "4 - Trocar jornada de trabalho\n" + 
            "5 - Postar mensagens\n" + 
            "9 - Sair\n" 
            
            );
        
        
        
    }

    public void exibirMenuCadastro(){
        System.out.println(

            "MENU DE CADASTRO:" + 
            "\n" +
            "1 - Mobile Members\n" + 
            "2 - Heavy Lifters\n" + 
            "3 - Script Guys\n" + 
            "4 - Big Brothers\n" +
            "9 - Sair"
  
        );
        


    }


    
}