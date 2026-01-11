package com.mycompany.eventmanagement;

public class Speaker {

    private int id;
    private String name;
    private int talkCounts;

    public Speaker() {
    }

    public Speaker(int id, String name, int talkCounts) {
        setId(id);
        setName(name);
        setTalkCounts(talkCounts);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        String idst = Integer.toString(id);
        if (id > 0 && idst.startsWith("9")) {
            this.id = id;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 5 && name.length() <= 15) {
            this.name = name;
        }

    }

    public int getTalkCounts() {
        return talkCounts;
    }

    public void setTalkCounts(int talkCounts) {
        if (talkCounts >= 1 && talkCounts <= 10) {
            this.talkCounts = talkCounts;
        }
    }

    public String getSpekDet() {
        return "ID: " + id + "|" + "Name: " + name + "|" + "Talks: " + talkCounts;
    }
}
