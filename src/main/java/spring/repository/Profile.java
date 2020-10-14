package spring.repository;

import java.io.Serializable;

public class Profile implements Serializable {
    private String voornaam;
    private String familienaam;
    private String description;
    private int profileId;

    public Profile(String voornaam, String familienaam, String description, int profileId) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.description = description;
        this.profileId = profileId;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }
}
