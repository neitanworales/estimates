package com.evertec.core_banking.estimates.models;

import java.util.ArrayList;

public class Phase {

    String tittle;
    ArrayList<Activity> activities;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
}
