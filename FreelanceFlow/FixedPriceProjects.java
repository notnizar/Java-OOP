
package com.mycompany.freelanceflow;

public class FixedPriceProjects extends Project implements Payable{
    private double fixedFee;

    public FixedPriceProjects(String projectTitle, Client client,  double fixedFee) {
        super(projectTitle, client);
        this.fixedFee = fixedFee;
    }

    @Override
    public double calculatePayment() {
      return fixedFee;
    }
    
}
