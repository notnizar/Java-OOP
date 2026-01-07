package com.mycompany.programmingcontest;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        ProgrammingContest contest = new ProgrammingContest();

        for (int i = 0; i < 4; i++) {
            System.out.println("Entering data for Team " + (i + 1));
            contest.addTeam();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter member Data: ");
        int limit = scanner.nextInt();

        for (Team t : contest.getTeams()) {
            if (t.getMembers() <= limit) {
                System.out.println(t.getTeaminfo());
            }
        }
    }
}
