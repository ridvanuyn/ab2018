package com.ridvan.ab2018.courseday1.Repository;

import com.ridvan.ab2018.courseday1.model.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contract, Integer> {
}
