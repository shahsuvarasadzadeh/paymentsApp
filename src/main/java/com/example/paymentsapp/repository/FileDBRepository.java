package com.example.paymentsapp.repository;

import com.example.paymentsapp.model.FileDb;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FileDBRepository extends JpaRepository<FileDb,Long> {

}
