package com.example.ppw.repository;

import com.example.ppw.model.akun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepo extends JpaRepository<akun,Long> {

}
