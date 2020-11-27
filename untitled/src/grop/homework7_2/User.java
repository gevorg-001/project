package grop.homework7_2;

public class User {
    private String userneme;
    private  String password;
    private String role_ADMIN;
    private String role_CUSTOMER;

    public User() {
    }

    public User(String password) {
        this.password = password;
    }

    public User(String userneme, String password) {
        this.userneme = userneme;
        this.password = password;
    }

    public String getUserneme() {
        return userneme;
    }

    public void setUserneme(String userneme) {
        this.userneme = userneme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole_ADMIN() {
        return role_ADMIN;
    }

    public void setRole_ADMIN(String role_ADMIN) {
        this.role_ADMIN = role_ADMIN;
    }

    public String getRole_CUSTOMER() {
        return role_CUSTOMER;
    }

    public void setRole_CUSTOMER(String role_CUSTOMER) {
        this.role_CUSTOMER = role_CUSTOMER;
    }
}
