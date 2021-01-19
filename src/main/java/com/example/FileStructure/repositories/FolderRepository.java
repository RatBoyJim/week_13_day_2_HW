package com.example.FileStructure.repositories;

import com.example.FileStructure.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
