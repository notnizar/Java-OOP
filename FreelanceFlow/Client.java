
package com.mycompany.freelanceflow;

public class Client extends User{
    private String companyName;

    public Client(String companyName, int ID, String name, String email) {
        super(ID, name, email);
        this.companyName = companyName;
    }
    
    

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void getProfile() {
        System.out.println("company name: " + companyName);
    }

    @Override
    public String toString() {
        return "Client{" + "companyName=" + companyName + '}';
    }
    
    
    
}
