package com.mycompany.programmingcontest;

public class Contest {

    private String name;
    private char level;
    private String location;

    public Contest() {
        name = "General";
        level = 'A';
        location = "Not defines";
    }

    public Contest(String name, char level, String location) {
        this.name = name;
        this.level = level;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {  //Ask  for what is entry case
        if (level == 'A' || level == 'B' || level == 'C') {
            this.level = level;
        }

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double RegFee() {
        double fees = 0;
        switch (level) {

            case 'A' -> {
                if (location.equalsIgnoreCase("amman")) {
                    fees = 40;
                } else if (location.equalsIgnoreCase("irbid")) {
                    fees = 20;
                }
            }

            case 'B' -> {
                if (location.equalsIgnoreCase("amman")) {
                    fees = 50;
                } else if (location.equalsIgnoreCase("irbid")) {
                    fees = 25;
                }
            }

            case 'C' -> {
                if (location.equalsIgnoreCase("amman")) {
                    fees = 70;
                } else if (location.equalsIgnoreCase("irbid")) {
                    fees = 35;
                }
            }
        }
        return fees;
    }

    @Override
    public String toString() {
        return "Contest{" + "name=" + name + ", level=" + level + ", location=" + location + '}';
    }

}
