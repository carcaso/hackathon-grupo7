package org.academiadecodigo.hackathon.help7hearts.persistence.model;


import javax.persistence.OneToOne;

public class Location extends AbstractModel {

    private String region;

    @OneToOne
    private Charity charity;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    @Override
    public String toString() {
        return "Location{" +
                "region='" + region + '\'' +
                ", charity=" + charity +
                '}';
    }
}
