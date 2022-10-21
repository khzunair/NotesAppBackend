package com.eagleLearns.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eagleLearns.springboot.entity.Notes;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {

}
