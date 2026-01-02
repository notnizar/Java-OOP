
package com.mycompany.freelanceflow;
 

public class HourlyProject extends Project implements Payable{
    
    private int hoursWorked;
    
    public HourlyProject(String projectTitle, Client client, int hoursWorked) {
        super(projectTitle, client);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        double totalHourlyRate = 0;
        for (FreeLancer f : getFreeLancers()) {
            if(f != null){
                totalHourlyRate += f.getHourlyRate();
            }
        }
        return totalHourlyRate * this.hoursWorked;
    }
    
}
