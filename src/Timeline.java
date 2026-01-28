import Models.Historia;
import java.util.ArrayList;

public class Timeline {
 
    private ArrayList<Historia> historias = new ArrayList<>();
    
    public Timeline(){
        historias.add(new Historia("INICIO","OP1","OP2","OP3"));
    }
    
}