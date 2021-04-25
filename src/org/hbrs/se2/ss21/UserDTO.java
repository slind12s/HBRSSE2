package org.hbrs.se2.ss21;

public class UserDTO {
    private String username;
    private String password;
    private String Email;
    private String usertype;

    public void setUsername(String name) {
        this.username = name;

    }

    public void setPassword(String password) {
        this.password = password;

    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public void defaultUser() {
        RegistrationResult keinUser = new RegistrationResult(false);
        keinUser.setkontrolle(0);
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.Email;
    }
    public String getUsertype(){
        return this.usertype;
    }


}
