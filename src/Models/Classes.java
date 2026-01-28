package Models;

public final class Classes {
 
    private String nomeClass;
    private int HP,MP,Str,Def,Int;
    
    public Classes(String nomeClass, int HP, int MP, int Str, int Def, int Int) {
        this.nomeClass = nomeClass;
        this.HP = HP;
        this.MP = MP;
        this.Str = Str;
        this.Def = Def;
        this.Int = Int;
    }
    
    public static Classes isMago(){
        return new Classes("Mago",20,35,10,20,40);
    }
    
    public static Classes isGuerreiro(){
        return new Classes("Guerreiro",40,15,45,30,10);
    }
    
    public static Classes isArqueiro(){
        return new Classes("Arqueiro",30,25,20,30,25);
    }

    public String getNomeClass() {
        return nomeClass;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getStr() {
        return Str;
    }

    public int getDef() {
        return Def;
    }

    public int getInt() {
        return Int;
    }
    
    
    
}