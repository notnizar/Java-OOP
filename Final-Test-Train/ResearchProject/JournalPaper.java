
import java.util.ArrayList;

public class JournalPaper extends ResearchItem implements Publishable{
    private double impactFactor;
    private ArrayList<Researcher> authors =  new ArrayList();
    
    public void addResearcher(){
    
    }
    
    public double calculateGrant(){
        return 0;
    }

}

