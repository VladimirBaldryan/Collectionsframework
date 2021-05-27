package com.company;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        Human human = new Human();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            human.setName(human.init1stLetter());
            human.setSurname(human.init1stLetter());
            human.setDateOfBirth(random.nextInt(80) + 1940);
            name.add(human.getName());
            surname.add(human.getSurname());
            age.add(2021 - human.getDateOfBirth());
            System.out.println(name.get(i) + " " + surname.get(i) + "yan " + age.get(i) + " years old");
        }
    }
}
