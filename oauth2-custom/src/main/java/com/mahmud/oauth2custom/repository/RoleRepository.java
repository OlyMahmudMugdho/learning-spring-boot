package com.mahmud.oauth2custom.repository;

import com.mahmud.oauth2custom.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
