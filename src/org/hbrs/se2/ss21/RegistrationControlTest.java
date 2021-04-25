package org.hbrs.se2.ss21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationControlTest {
    @Test
    public void testEasy(){
        RegistrationResult result = RegistrationControl.registerUser(new UserDTO());
        assertNotNull(result);
    }
    @Test
    public void testWithFactory(){
        UserDTO dto = UserFactory.createDefaultUserWithNoEmail();
        RegistrationResult result = RegistrationControl.registerUser(dto);
        assertFalse(result.getResult());
        dto = UserFactory.createUserWithNameAndPassword("Jörgen","abcd");
        result = RegistrationControl.registerUser(dto);
        assertTrue(result.getResult());
        dto = UserFactory.createDefaultUserWithNoPassword();
        result = RegistrationControl.registerUser(dto);
        assertFalse(result.getResult());
        dto = UserFactory.createDefaultUserWithNoName();
        result = RegistrationControl.registerUser(dto);
        assertFalse(result.getResult());
        dto = UserFactory.createUserWithoutAnything();
        result = RegistrationControl.registerUser(dto);
        assertFalse(result.getResult());

    }


}