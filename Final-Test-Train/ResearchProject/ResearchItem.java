public abstract class ResearchItem {
    private String  title;
    private char domain;
    private double budget;

    public ResearchItem(String title, char domain, double budget) {
        setBudget(budget);
        setDomain(domain);
        setTitle(title);
    }
    
    abstract public double calculateGrant();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getDomain() {
        return domain;
    }

    public void setDomain(char domain) {
        this.domain = domain;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    
}
