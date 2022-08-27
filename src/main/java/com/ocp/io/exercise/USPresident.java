package com.ocp.io.exercise;

import java.io.Serializable;

public class USPresident implements Serializable {
    private String name;
    private String description;
    private int term;

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public USPresident(String name, String description, int term) {
        this.name = name;
        this.description = description;
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "USPresident{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", term=" + term +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
