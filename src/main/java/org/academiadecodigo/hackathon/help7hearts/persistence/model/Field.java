package org.academiadecodigo.hackathon.help7hearts.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Field extends AbstractModel {

    private String category;

    @OneToOne
    private Charity charity;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    @Override
    public String toString() {
        return "Field{" +
                "category='" + category + '\'' +
                ", charity=" + charity.getName() +
                '}';
    }
}
