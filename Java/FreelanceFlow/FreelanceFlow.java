

package com.mycompany.freelanceflow;

public class FreelanceFlow {
    public static void main(String[] args) {
        Client clirnt1 = new Client("Nizar Comp", 1, "Nizar", "NizarZaid472@gmail.com");
        FreeLancer freelanc1 = new FreeLancer(new String[]{"Java", "Python"}, 60, 1, "Nizar", "NizzarZaid472@gmail.com");
        FreeLancer freelanc2 = new FreeLancer(new String[]{"Flutter", "Python"}, 60, 2, "Nizar", "NizzarZaid472@gmail.com");
           
        HourlyProject pro1 = new HourlyProject("Test Project", clirnt1, 10);
        pro1.addFreelance(freelanc1);
        
        System.out.println("cost: " + pro1.calculatePayment());
    }
}
