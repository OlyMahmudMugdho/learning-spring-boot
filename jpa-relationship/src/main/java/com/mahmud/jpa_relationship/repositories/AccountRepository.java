package com.mahmud.jpa_relationship.repositories;

import com.mahmud.jpa_relationship.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
