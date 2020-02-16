package com.gdg.feedbackapp;

import java.io.Serializable;

public class GDGFeedback implements Serializable {

    String name;
    String occupation;
    int rating;
    String qualification;
    String suggestion;
    int age;
    boolean isAgree;

    public GDGFeedback(String name, String occupation, int rating, String qualification, String suggestion, int age, boolean isAgree) {
        this.name = name;
        this.occupation = occupation;
        this.rating = rating;
        this.qualification = qualification;
        this.suggestion = suggestion;
        this.age = age;
        this.isAgree = isAgree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAgree() {
        return isAgree;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }
}
