package com.mycompany.programmingcontest;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammingContest extends Contest {

    private String language;
    private int numofProplem;
    private ArrayList<Team> teams = new ArrayList<>();

    public ProgrammingContest() {
        super();
        language = "java";
        numofProplem = 3;
    }

    public ProgrammingContest(String name, char level, String location, String language, int numofProplem, int id, String teamName, int members) {
        super(name, level, location);
        setLanguage(language);
        setLevel(level);
        setLocation(location);
        addTeam(id,teamName,members);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if (language.equalsIgnoreCase("java") || language.equalsIgnoreCase("python") || language.equalsIgnoreCase("c++")) {
            this.language = language;
        } else {
            System.out.println("Invalid Languge");
        }
    }

    public int getNumofProplem() {
        return numofProplem;
    }

    public void setNumofProplem(int numofProplem) {
        if (numofProplem >= 3) {
            this.numofProplem = numofProplem;
        }else{
            this.numofProplem = 3;
        }
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public void addTeam() {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Team ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Number of Members: ");
        int members = scanner.nextInt();
        scanner.nextLine(); // to not skip name
        System.out.print("Enter Team Name: ");
        String name = scanner.nextLine();
        
        addTeam(id, name, members);
    }

    public void addTeam(int id, String name, int members) {
        Team newTeam = new Team(id, name, members);
        teams.add(newTeam);
    }

    @Override
    public double RegFee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is this a student team? (true or false)");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent) {
            return super.RegFee() - 10;
        } else {
            return 100;
        }
    }

    @Override
    public String toString() {
        return "ProgrammingContest{" + "language=" + language + ", numofProplem=" + numofProplem + ", teams=" + teams + '}';
    }

}
