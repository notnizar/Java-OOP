
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
        String strid = Integer.toString(employeeID);
        if (strid.length() == 5 && strid.startsWith("7")) {
            this.employeeID = employeeID;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean isadminn = name.contains("Admin");

        if (name.length() >= 5 && isadminn == false) {
            this.name = name;

        }

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        if (rank.equalsIgnoreCase("Professor") || rank.equalsIgnoreCase("Associate") || rank.equalsIgnoreCase("Assistant")) {
            this.rank = rank;
        }
    }
    
    public String getResearcherInfo(){
        return  "["+rank+"]" + name + "(ID:" + employeeID + ")";
    }

}
