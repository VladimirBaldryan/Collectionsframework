package com.company;

import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String letters = ("abcdefghijklmnopqrstuvwxyz");
        Random random = new Random();
        int nameLength = random.nextInt(5) + 1;
        StringBuilder nameBuilder = new StringBuilder(name);
        for (int i = 0; i < nameLength; i++) {
            char letter1 = letters.charAt(random.nextInt(25));
            nameBuilder.append(letter1);
        }
        name = nameBuilder.toString();
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String letters = ("abcdefghijklmnopqrstuvwxyz");
        Random random = new Random();
        int surnameLength = random.nextInt(5) + 1;
        StringBuilder surnameBuilder = new StringBuilder(surname);
        for (int i = 0; i < surnameLength; i++) {
            char letter1 = letters.charAt(random.nextInt(25));
            surnameBuilder.append(letter1);
        }
        surname = surnameBuilder.toString();
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String init1stLetter() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        return Character.toString(letters.charAt(random.nextInt(25)));
    }
}
