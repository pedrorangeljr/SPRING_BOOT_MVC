package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Telefone;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface TelefoneRepository extends CrudRepository<Telefone, Long>{

	
}
