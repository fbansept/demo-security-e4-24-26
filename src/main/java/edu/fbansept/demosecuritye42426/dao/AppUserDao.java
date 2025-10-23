package edu.fbansept.demosecuritye42426.dao;

import edu.fbansept.demosecuritye42426.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserDao extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findByEmail(String email);
}
