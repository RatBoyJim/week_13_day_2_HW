package com.example.FileStructure.repositories;

import com.example.FileStructure.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
