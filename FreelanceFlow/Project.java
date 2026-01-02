package com.mycompany.freelanceflow;

public class Project {


    private String projectTitle;
    private Client client;
    private FreeLancer freeLancers[] = new FreeLancer[5];

    public Project(String projectTitle, Client client) {
        this.projectTitle = projectTitle;
        this.client = client;
    }

    public void addFreelance(FreeLancer f) {
        for (int i = 0; i < freeLancers.length; i++) {
            if (freeLancers[i] == null) {
                    freeLancers[i] = f;
                    System.out.println("Freelancer Added");
                    return;
            }
        }
        System.out.println("project team is full");
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public FreeLancer[] getFreeLancers() {
        return freeLancers;
    }

    public void setFreeLancers(FreeLancer[] freeLancers) {
        this.freeLancers = freeLancers;
    }

}
