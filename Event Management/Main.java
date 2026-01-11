package com.mycompany.eventmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TechConference event1 = new TechConference();

        populateSpeakers(event1);

        SearchSpe(scanner, event1);

    }

    public static void SearchSpe(Scanner scanner, TechConference event1) {
        System.out.println("Enter talkcount threshold: ");
        int threshold = scanner.nextInt();
        for (Speaker speaker : event1.getSpeakers()) {
            if (speaker.getTalkCounts() > threshold) {
                System.out.println("Spekars: " + speaker.getSpekDet());
            }
        }
    }

    public static void populateSpeakers(TechConference event1) {
        for (int i = 0; i < 3; i++) {
            event1.addSpeakers();
        }
    }

}
