package com.kodilla.testing.user;

public class SimpleUser {
    private String username;
    private String realName;
    private String surname;




    public SimpleUser(String username, String realName, String surname) {
        this.username = username;
        this.realName = realName;
        this.surname = surname;

    }

    public String getUsername() {
        return username;
    }
    public String getRealName() { return realName; }
    public String getSurname() { return surname;}
}
