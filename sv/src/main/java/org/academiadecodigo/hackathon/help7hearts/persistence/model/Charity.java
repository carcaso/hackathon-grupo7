package org.academiadecodigo.hackathon.help7hearts.persistence.model;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "charity")
public class Charity extends AbstractModel {

    private String name;

    @NotNull
    private String location;

    @NotNull
    private String category;

    private String description;

    @NotNull
    private Boolean hasDonationDemand;

    @NotNull
    private Boolean hasVolunteeringDemand;

    private String email;
    private String phone;

    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String logoUrl;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHasDonationDemand() {
        return hasDonationDemand;
    }

    public void setHasDonationDemand(Boolean hasDonationDemand) {
        this.hasDonationDemand = hasDonationDemand;
    }

    public Boolean getHasVolunteeringDemand() {
        return hasVolunteeringDemand;
    }

    public void setHasVolunteeringDemand(Boolean hasVolunteeringDemand) {
        this.hasVolunteeringDemand = hasVolunteeringDemand;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
