package com.example.demorecycler;

public class Contact {

    private int profilePic;
    private String name;
    private String number;

    public Contact(int profilePic, String name, String number) {
        this.profilePic = profilePic;
        this.name = name;
        this.number = number;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
