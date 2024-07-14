package com.example.dictionary.repository;

import com.example.dictionary.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DataRepository extends JpaRepository<Data, UUID> {
}