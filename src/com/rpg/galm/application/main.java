
import Models.Classes;
import Models.Player;
import java.util.Scanner;

public class main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Digite o nome do seu personagem: ");
        String nome = sc.nextLine();
        
        
        
        System.out.println("Escolha sua Classe:");
        System.out.println("1-Mago: usa magia e inteligenca");
        System.out.println("2-Guerreiro: Bate e e forte pra carai");
        System.out.println("3-Arquiro: visao apurada e agil");
        System.out.print("...sua Escolha de Classe: ");
        
        Player p1 = new Player(nome,getClasseSel());
        
        System.out.print("Seu "+p1.getClasse().getNomeClass()+" se chama "+p1.getNome());
        
        
        
        sc.close();
    }
    
    public static Classes getClasseSel(){
        int escolha = 1;
        
        do{
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    return Classes.isMago();
                case 2:
                    return Classes.isGuerreiro();
                case 3:
                    return Classes.isArqueiro();
                default:
                    System.out.println("Escolha invalida");
                    continue;
            }
        }while(escolha < 1 && escolha > 3);
        return null;
    }
}