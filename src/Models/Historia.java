package Models;

public class Historia {
    
    private String texto;
    
    private String ops[];
    
    public Historia(String texto, String... ops) {
        this.texto = texto;
        this.ops = ops;
    }
    
}