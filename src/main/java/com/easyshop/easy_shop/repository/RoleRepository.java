package com.easyshop.easy_shop.repository;

import com.easyshop.easy_shop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String role);
}
