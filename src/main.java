
import Models.Classes;
import Models.Player;
import java.util.Scanner;

public class main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Digite o nome do seu personagem: ");
        String nome = sc.nextLine();
        
        Player p1 = new Player(nome,getClasseSel());
        
        System.out.println("Seu "+p1.getClasse().getNomeClass()+" se chama "+p1.getNome());
        System.out.println("Boa Sorte !!!");
        
        Timeline campanha = new Timeline();
        campanha.start(p1);
        
        sc.close();
    }
    
    public static Classes getClasseSel(){
        int escolha = 1;
        
        do{
            System.out.println("Escolha sua Classe:");
            System.out.println("1-Mago: usa magia e inteligenca");
            System.out.println("2-Guerreiro: Bate e e forte pra carai");
            System.out.println("3-Arquiro: visao apurada e agil");
            System.out.print("...sua Escolha de Classe: ");
            
            escolha = sc.nextInt(); 
            
            switch (escolha) {
                case 1:
                    return Classes.isMago();
                case 2:
                    return Classes.isGuerreiro();
                case 3:
                    return Classes.isArqueiro();
                default:
                    System.out.println("Escolha invalida!!! \n");
                    continue;
            }
        }while(escolha < 1 || escolha > 3);
        return null;
    }
}