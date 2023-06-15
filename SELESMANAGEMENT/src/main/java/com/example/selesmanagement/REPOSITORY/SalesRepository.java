package com.example.selesmanagement.REPOSITORY;

import com.example.selesmanagement.ENTITY.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<SalesEntity,Long> {
}
