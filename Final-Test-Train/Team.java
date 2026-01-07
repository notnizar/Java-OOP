package com.mycompany.programmingcontest;

public class Team {

    private int id;
    private String name;
    private int members;

    public Team() {
        id = 11;
        name = "Not Defiende";
        members = 3;
    }

    public Team(int id, String name, int members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        String idst = String.valueOf(id);
        if (id != 0 && idst.startsWith("1")) {
            this.id = id;

        } else {
            System.out.println("Invaild INput");
        }
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
                
        if (name != null && name.toLowerCase().startsWith("a") && name.length() <= 10) {
           this.name = name;
        }else{
            System.out.println("Invaild Input");
        }
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        if(members >= 3 && members <= 5){
                    this.members = members;

        }else{
            System.out.println("Invalid input");
        }
    }

    public String getTeaminfo() {
        return id + "*****" + name + "*****" + members;
    }
}
