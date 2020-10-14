package spring.repository;

import java.util.List;

public interface ProfileRepository {
    List<Profile> getProfiles();
    public Profile getProfile(int profileId);
}
