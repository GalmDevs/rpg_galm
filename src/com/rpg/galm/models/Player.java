package Models;

public class Player {
    
    private String Nome;
    private Classes classe;

    public Player(String Nome, Classes classe) {
        this.Nome = Nome;
        this.classe = classe;
    }

    public String getNome() {
        return Nome;
    }

    public Classes getClasse() {
        return classe;
    }
    
}
