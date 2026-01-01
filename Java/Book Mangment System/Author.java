public class Author {
    private String authName;
    private String authNatiolatly;
    private String authEmail;
    
    
    public Author(String authName, String authNatiolatly, String authEmail) {
        this.authName = authName;
        this.authNatiolatly = authNatiolatly;
        this.authEmail = authEmail;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthNatiolatly() {
        return authNatiolatly;
    }


    public void setAuthNatiolatly(String authNatiolatly) {
        this.authNatiolatly = authNatiolatly;
    }

    public String getAuthEmail() {
        return authEmail;
    }

    public void setAuthEmail(String authEmail) {
        this.authEmail = authEmail;
    }
    
}
