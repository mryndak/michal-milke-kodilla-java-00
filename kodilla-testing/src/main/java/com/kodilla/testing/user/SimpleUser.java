package com.kodilla.testing.user;

public class SimpleUser {
    private String username;
    private String realName;
    private String surname;
    private String age;




    public SimpleUser(String username, String realName, String surname, String age) {
        this.username = username;
        this.realName = realName;
        this.surname = surname;
        this.age = age;

    }

    public String getUsername() {
        return username;
    }
    public String getRealName() {
        return realName;
    }
    public String getSurname() {
        return surname;
    }
    public String getAge() {
        return age;
    }
}
