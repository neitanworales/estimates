package com.evertec.core_banking.estimates.models;

import java.util.ArrayList;

public class Project {

    String name;
    ArrayList<Phase> phases;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Phase> getPhases() {
        return phases;
    }

    public void setPhases(ArrayList<Phase> phases) {
        this.phases = phases;
    }
}
