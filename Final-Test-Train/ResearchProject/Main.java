public class Main {

    public static void main(String[] args) {
        ResearchItem paper1 = new JournalPaper("AI", 'M', 5000);

        fillResearcherData(paper1);

        ((JournalPaper) paper1).setImpactFactor(8.5);
        System.out.println("Total Grant: " + paper1.calculateGrant() + " JOD");

        if (paper1 instanceof Publishable publishable) {
            publishable.printDigitalStamp();
        }

        System.out.println("\n Professor List");
        boolean found = false;
        for (Researcher r : ((JournalPaper) paper1).getAuthors()) {
            if (r.getRank().equalsIgnoreCase("Professor")) {
                System.out.println(r.getResearcherInfo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No researchers found");
        }
    }

    public static void fillResearcherData(ResearchItem item) {
        JournalPaper paper = (JournalPaper) item;

        for (int i = 0; i < 2; i++) {
            System.out.println("\n Entering data for Researcher #" + (i + 1));
            paper.addResearcher();
        }
    }
}
