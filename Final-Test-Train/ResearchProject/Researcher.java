public class Researcher {
    private int employeeID;
    private String name;
    private String rank;

    public Researcher() {
    }

    public Researcher(int employeeID, String name, String rank) {
        setEmployeeID(employeeID);
        setName(name);
        setRank(rank);
    }
    
    

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
}
