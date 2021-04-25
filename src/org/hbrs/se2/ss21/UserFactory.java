package org.hbrs.se2.ss21;

public class UserFactory {

    public static UserDTO createUserWithNameAndPassword (String username, String password){
        UserDTO dto = new UserDTO();
        dto.setUsername(username);
        dto.setPassword(password);
        return dto;
    }
    public static UserDTO createDefaultUserWithNoPassword(){
        UserDTO dto = UserFactory.getDefaultUser();
        dto.setPassword("");
        return dto;
    }
    public static UserDTO createDefaultUserWithNoName(){
        UserDTO dto = UserFactory.getDefaultUser();
        dto.setUsername("");
        return dto;
    }
    public static UserDTO createUserWithoutAnything() {
        UserDTO dto = UserFactory.getDefaultUser();
        dto.setUsername("");
        dto.setPassword("");
        dto.setEmail("");
        dto.setUsertype("");
        return dto;
    }
    public static UserDTO createDefaultUserWithNoEmail(){
        UserDTO dto = UserFactory.getDefaultUser();
        dto.setEmail("");
        return dto;
    }


    private static UserDTO getDefaultUser(){
        UserDTO dto = new UserDTO();
        dto.defaultUser();
        return dto;
    }

    private static UserDTO createDefaultUserWithPassword(){
        UserDTO dto = UserFactory.getDefaultUser();
        dto.setUsername("");
        return dto;
    }
}
