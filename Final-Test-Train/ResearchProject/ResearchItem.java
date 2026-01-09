public abstract class ResearchItem {
    protected String  title;
    protected char domain;
    protected double budget;

    public ResearchItem(String title, char domain, double budget) {
        setBudget(budget);
        setDomain(domain);
        setTitle(title);
    }
    
    public abstract double calculateGrant();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title.toUpperCase();
        this.title = title;
    }

    public char getDomain() {
        return domain;
    }

    public void setDomain(char domain) {
        if (domain == 'M' || domain == 'T' || domain == 'E') {
           this.domain = domain;        
        }
        
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "ResearchItem{" + "title=" + title + ", domain=" + domain + ", budget=" + budget + '}';
    }
    
    
    
    
}
