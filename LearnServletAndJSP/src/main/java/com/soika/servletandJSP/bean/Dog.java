package com.soika.servletandJSP.bean;

/**
 * Created by Andrei_Soika on 1/25/2016.
 */
public class Dog {

    String breed;
    String nick;

    public Dog(String breed, String nick) {
        this.breed = breed;
        this.nick = nick;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
