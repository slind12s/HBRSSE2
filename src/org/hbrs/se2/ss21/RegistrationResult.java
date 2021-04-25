package org.hbrs.se2.ss21;


import java.util.ArrayList;
import java.util.List;


public class RegistrationResult {
    private List registrationlist = new ArrayList();
    private RegistrationResult registerresult;
    public int kontrolle = 0;


    public RegistrationResult(UserDTO user){
        if(user.getEmail()!= ""& user.getPassword()!= "" & user.getUsername()!= "" & user.getUsertype()!= "") {
            this.kontrolle = 1;
        }
        else {
            this.kontrolle = 0;
        }

    }
    public RegistrationResult(boolean erfolg){
        this.kontrolle = 0;
   }


    public void setkontrolle(int kontrolle) {
        this.kontrolle = kontrolle;
    }

    public boolean getResult () {
        if (kontrolle > 0){
            this.kontrolle = 0;
            System.out.println("Sie haben sich erfolgreich bei COLL@HBRS registriert");
            return true;
        }
            System.out.println("Registrierung fehlgeschlagen");
            return false;

    }
    }
