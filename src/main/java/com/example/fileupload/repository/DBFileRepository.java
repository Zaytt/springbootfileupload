package com.example.fileupload.repository;

import com.example.fileupload.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Create a repository to save files in the database and retrieve them back

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {
}
