
public class Author {
    private String authName;
    private String authNationality;
    private String authEmail;
    
    
    public Author(String authName, String authNatiolatly, String authEmail) {
        this.authName = authName;
        this.authNationality = authNatiolatly;
        this.authEmail = authEmail;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthNationality() {
        return authNationality;
    }


    public void setAuthNationality(String authNatiolatly) {
        this.authNationality = authNatiolatly;
    }

    public String getAuthEmail() {
        return authEmail;
    }

    public void setAuthEmail(String authEmail) {
        this.authEmail = authEmail;
    }
    
}
