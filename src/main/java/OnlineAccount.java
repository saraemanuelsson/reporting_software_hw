import Cards.ICharge;

import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private ArrayList<ICharge> paymentMethods;
    private ReportingSoftware reportingSoftware;

    public OnlineAccount(String name, ReportingSoftware reportingSoftware){
        this.name = name;
        this.paymentMethods = new ArrayList<ICharge>();
        this.reportingSoftware = reportingSoftware;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ICharge> getPaymentMethods() {
        return this.paymentMethods;
    }

    public void addPaymentMethod(ICharge paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }

    public ReportingSoftware getReportingSoftware() {
        return this.reportingSoftware;
    }

    public void chargeCustomer(double amount, ICharge paymentMethod){
        paymentMethod.charge(amount);
        double transactionCost = paymentMethod.getTransactionCost(amount);
        this.reportingSoftware.addTransactionCost(transactionCost);
    }

}
