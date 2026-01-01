package com.mycompany.freelanceflow;

import java.util.Scanner;

public class Project {

    Scanner scanner = new Scanner(System.in);

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

}
