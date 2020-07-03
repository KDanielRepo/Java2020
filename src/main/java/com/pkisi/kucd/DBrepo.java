package com.pkisi.kucd;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DBrepo extends CrudRepository<Users,Integer> {
    Users findByLogin(String login);
    List<Custom> findAllBy();
}
