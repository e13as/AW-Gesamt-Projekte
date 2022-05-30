package com.example.blog.repository;

import com.example.blog.model.Beitrag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeitragRepository extends JpaRepository<Beitrag, Long> {

}
