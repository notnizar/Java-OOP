
import java.util.ArrayList;
import java.util.Scanner;

public class JournalPaper extends ResearchItem implements Publishable {

    private double impactFactor;
    private ArrayList<Researcher> authors = new ArrayList();

    public JournalPaper(String title, char domain, double budget) {
        super(title, domain, budget);
    }

    public void addResearcher() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID (5 digits starting with 7): ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Name (Min 5 chars, no 'Admin'): ");
        String name = scanner.nextLine();

        System.out.print("Enter Rank (Professor, Associate, Assistant): ");
        String rank = scanner.nextLine();

        Researcher newResearcher = new Researcher(id, name, rank);
        authors.add(newResearcher);

        System.out.println("Researcher added successfully.");
    }

    @Override
    public double calculateGrant() {
        double grant = 0.0;
        if (domain == 'M') {
            grant = budget * 1.5 + (impactFactor * 100);

        } else {
            grant = budget * 1.2;
        }
        return grant;
    }

    @Override
    public void printDigitalStamp() {
        System.out.println("Verifiyed Journal : " + title);

    }

    public double getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(double impactFactor) {
        if (impactFactor >= 0.0 && impactFactor <= 10.0) {
            this.impactFactor = impactFactor;

        }

    }

    public ArrayList<Researcher> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Researcher> authors) {
        this.authors = authors;
    }

}
