package spring.repository;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProfileRepositoryImpl implements ProfileRepository {
    private Map<Integer, Profile> profileMap = new HashMap<>();

    @PostConstruct//dit is eigenlijk:nadat de bean is aangemaakt van de interface gaan we volgende elementen erin steken
    public void init() {
        Profile profileMaxim = new Profile("Maxim", "Verbeeck",
                "beschrijving Maxim", 0);
        profileMap.put(profileMaxim.getProfileId(), profileMaxim);
        Profile profileWouter = new Profile("Wouter", "Kennis",
                "beschrijving Wouter", 1);
        profileMap.put(profileWouter.getProfileId(), profileWouter);
        Profile profileThomasG = new Profile("Thomas", "Goos",
                "beschrijving Thomas Goos", 2);
        profileMap.put(profileThomasG.getProfileId(), profileThomasG);
        Profile profileSebastien = new Profile("Sebastien","Revis",
                "beschrijving Sebastien",3);
        profileMap.put(profileSebastien.getProfileId(),profileSebastien);
        Profile profileThomasV = new Profile("Thomas","Veris",
                "beschrijving Thomas veris",4);
        profileMap.put(profileThomasV.getProfileId(),profileThomasV);
        Profile profileTibo = new Profile("Tibo","","beschrijving Tibo",
                5);
        profileMap.put(profileTibo.getProfileId(),profileTibo);
    }

    @Override
    public List<Profile> getProfiles() {
        return new ArrayList<Profile>(profileMap.values());
    }

    @Override
    public Profile getProfile(int profileId) {
        return profileMap.entrySet()
                .stream()
                .filter(e -> e.getKey().equals(profileId))
                .map(Map.Entry::getValue)
                .findFirst()
                .get();
    }
}
