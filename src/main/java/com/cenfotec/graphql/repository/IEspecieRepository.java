package com.cenfotec.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenfotec.graphql.model.Especie;

@Repository
public interface IEspecieRepository extends JpaRepository<Especie, Integer>{

	public Especie findByGuid(int guid);
}
