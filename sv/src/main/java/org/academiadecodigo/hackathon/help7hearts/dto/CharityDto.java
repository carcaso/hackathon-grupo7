package org.academiadecodigo.hackathon.help7hearts.dto;

import javax.validation.constraints.*;

public class CharityDto {

    private Integer id;

    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min = 3, max = 64)
    private String name;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 16)
    private String location;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 16)
    private String category;

    @NotNull
    @NotBlank
    private String description;

    @Email
    @NotBlank(message = "Email is mandatory")
    private String email;

    @Pattern(regexp = "^\\+?[0-9]*$", message = "Phone number contains invalid characters")
    @Size(min = 9, max = 16)
    private String phone;

    @NotNull
    @NotBlank
    private boolean hasDonationsDemand;

    @NotNull
    @NotBlank
    private boolean hasVolunteersDemand;

    @NotNull
    @NotBlank
    private String website;

    private String longDescription;

    @NotNull
    @NotBlank
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public boolean isHasDonationsDemand() {
        return hasDonationsDemand;
    }

    public void setHasDonationsDemand(boolean hasDonationsDemand) {
        this.hasDonationsDemand = hasDonationsDemand;
    }

    public boolean isHasVolunteersDemand() {
        return hasVolunteersDemand;
    }

    public void setHasVolunteersDemand(boolean hasVolunteersDemand) {
        this.hasVolunteersDemand = hasVolunteersDemand;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLogo() {
        return longDescription;
    }

    public void setLogo(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
