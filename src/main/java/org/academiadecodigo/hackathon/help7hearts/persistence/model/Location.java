package org.academiadecodigo.hackathon.help7hearts.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
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
