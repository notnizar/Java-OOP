package com.mycompany.eventmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class TechConference extends Event {

    Scanner scanner = new Scanner(System.in);

    private String track;
    private int minHardWare;
    private ArrayList<Speaker> speakers = new ArrayList();

    public TechConference() {
        track = "Java";
        minHardWare = 1;
    }

    public TechConference(String track, int minHardWare, String title, char category, String city) {
        super(title, category, city);
        setTrack(track);
        setMinHardWare(minHardWare);
        Speaker spekar = new Speaker();
        speakers.add(spekar);
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getMinHardWare() {
        return minHardWare;
    }

    public void setMinHardWare(int minHardWare) {
        this.minHardWare = minHardWare;
    }

    public ArrayList<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(ArrayList<Speaker> speakers) {
        this.speakers = speakers;
    }

    public void addSpeakers() {
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.next();
        int talkCounts = scanner.nextInt();

        Speaker nspekar = new Speaker(id, name, talkCounts);
        speakers.add(nspekar);

    }

    @Override
    public double calcTiketPrice() {
        double diprice = 0;
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            diprice = super.calcTiketPrice() * 15 / 100;
        } else {
            diprice = super.calcTiketPrice() + 50;

        }
        return 0;
    }

    @Override
    public String toString() {
        return "TechConference{" + "track=" + track + ", minHardWare=" + minHardWare + ", speakers=" + speakers + '}';
    }
    
    

}
