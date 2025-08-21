package com.example.amirkalif;

public class Musician {
    private String firstName;
    private String lastName;
    private String imageFile;

    public Musician(String firstName, String lastName, String imageFile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageFile = imageFile;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getImageFile() { return imageFile; }
    public void setImageFile(String imageFile) { this.imageFile = imageFile; }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
