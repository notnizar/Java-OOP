
package com.mycompany.eventmanagement;

import java.util.ArrayList;

public class TechConference extends Event{
    private String track;
    private int minHardWare;
    private ArrayList<Speaker> speakers = new ArrayList();

    public TechConference() {
    }

    public TechConference(String track, int minHardWare) {
        this.track = track;
        this.minHardWare = minHardWare;
    }

    public TechConference(String track, int minHardWare, String title, char category, String city) {
        super(title, category, city);
        this.track = track;
        this.minHardWare = minHardWare;
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
    
    public void addSpeakers(){
        
    }

    @Override
    public double calcTiketPrice() {
        return 0;
    }
    
    
    
    
}
