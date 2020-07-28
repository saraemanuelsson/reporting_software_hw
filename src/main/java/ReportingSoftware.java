import java.util.ArrayList;

public class ReportingSoftware {

    private ArrayList<Double> transactionCosts;

    public ReportingSoftware(){
        this.transactionCosts = new ArrayList<Double>();
    }

    public ArrayList<Double> getTransactionCosts() {
        return this.transactionCosts;
    }

    public void addTransactionCost(double transactionCost){
        this.transactionCosts.add(transactionCost);
    }
}
