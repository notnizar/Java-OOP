package com.mycompany.freelanceflow;



public class FreeLancer extends User{
    private String skills[];
    private int hourlyRate;

    public FreeLancer(String[] skills, int hourlyRate, int ID, String name, String email) {
        super(ID, name, email);
        this.skills = skills;
        this.hourlyRate = hourlyRate;
    }



    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void getProfile() {
        System.out.println("I am a freelacer with this skills:") ;
        System.out.println("My hourly Rate: " + hourlyRate);
    }

    @Override
    public String toString() {
        return "FreeLancer{" + "skills=" + skills + ", hourlyRate=" + hourlyRate + '}';
    }
    
}
