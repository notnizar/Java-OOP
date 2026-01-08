package com.mycompany.hotelmangament;

public class Guest {

    private int nationalID;
    private String name;
    private int points;

    public Guest() {
    }

    public Guest(int nationalID, String name, int points) {
         setName(name);
         setNationalID(nationalID);
         setPoints(points);
         
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        String idstr = Integer.toString(nationalID);

        if (nationalID != 0 && idstr.startsWith("2")) {
            this.nationalID = nationalID;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() <= 15 && name.startsWith("M")) {
            this.name = name;
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        if (points >= 0 && points <= 1000) {
            this.points = points;
        }
    }

    public String getGuestInfo() {
        return nationalID + "####" + name + "####" + points;

    }

}
