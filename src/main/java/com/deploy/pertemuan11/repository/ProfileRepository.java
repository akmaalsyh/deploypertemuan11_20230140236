package com.deploy.pertemuan11.repository;

import com.deploy.pertemuan11.model.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
}
