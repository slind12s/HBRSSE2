package org.hbrs.se2.ss21;

import java.util.HashMap;
import java.util.Map;

public class RegistrationControl {

    public static RegistrationResult registerUser (UserDTO user){
        RegistrationResult results = new RegistrationResult(user);
        return results;

    }
}
