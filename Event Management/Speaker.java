
package com.mycompany.eventmanagement;


public class Speaker {
    private int id;
    private String name;
    private int talkCounts;

    public Speaker() {
    }

    public Speaker(int id, String name, int talkCounts) {
        this.id = id;
        this.name = name;
        this.talkCounts = talkCounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTalkCounts() {
        return talkCounts;
    }

    public void setTalkCounts(int talkCounts) {
        this.talkCounts = talkCounts;
    }
    
    public String getSpekDet(){
        return "";
    }
}
