package s.problem;

public class User {

    private int id;
    private String primaryEmail;
    private String secondaryEmail;
    private Role role;


    public int getId() {
        return id;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public Role getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void sendMoney(User userTo, int money){
        // transfer money to someone
    }


}
