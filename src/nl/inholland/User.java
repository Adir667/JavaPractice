package nl.inholland;

public class User {

    protected String username;
    protected String password;
    protected Enums.Access access;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Enums.Access getAccess() {
        return access;
    }

    public void setAccess(Enums.Access access) {
        this.access = access;
    }
}

