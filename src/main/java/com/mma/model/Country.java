package com.mma.model;

import javax.persistence.Embeddable;

@Embeddable
public class Country {

    private String born;
    private String trained;
    private String fightingFor;

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getTrained() {
        return trained;
    }

    public void setTrained(String trained) {
        this.trained = trained;
    }

    public String getFightingFor() {
        return fightingFor;
    }

    public void setFightingFor(String fightingFor) {
        this.fightingFor = fightingFor;
    }

    @Override
    public String toString() {
        return "Country{" +
                "born='" + born + '\'' +
                ", trained='" + trained + '\'' +
                ", fightingFor='" + fightingFor + '\'' +
                '}';
    }
}
