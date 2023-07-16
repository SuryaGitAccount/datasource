package com.data1.repo;

import com.data1.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo extends JpaRepository<File,Long> {
}
