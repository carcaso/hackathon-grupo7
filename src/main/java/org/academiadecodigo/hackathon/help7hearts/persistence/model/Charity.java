package org.academiadecodigo.hackathon.help7hearts.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "charity")
public class Charity extends AbstractModel {

    private String name;

    @OneToOne(
            cascade = {CascadeType.ALL},
            mappedBy = "charity",
            fetch = FetchType.EAGER
    )
    private Location location;

    @OneToOne(
            cascade = {CascadeType.ALL},
            mappedBy = "charity",
            fetch = FetchType.EAGER
    )
    private Field field;

    private String description;
    private Boolean hasDonationDemand;
    private Boolean hasVolunteeringDemand;
    private String email;
    private String phone;
    private String logoUrl;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
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

    @Override
    public String toString() {
        return "Charity{" +
                "name='" + name + '\'' +
                ", location='" + location.getRegion() + '\'' +
                ", field='" + field.getCategory() + '\'' +
                ", description='" + description + '\'' +
                ", hasDonationDemand=" + hasDonationDemand +
                ", hasVolunteeringDemand=" + hasVolunteeringDemand +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
