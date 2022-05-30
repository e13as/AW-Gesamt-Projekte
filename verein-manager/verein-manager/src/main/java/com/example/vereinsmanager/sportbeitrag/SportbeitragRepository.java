package com.example.vereinsmanager.sportbeitrag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportbeitragRepository extends CrudRepository<Sportbeitrag, Long> {
    //CRUD: CREATE READ UPDATE DELETE

    List<Sportbeitrag> findAll();
}
