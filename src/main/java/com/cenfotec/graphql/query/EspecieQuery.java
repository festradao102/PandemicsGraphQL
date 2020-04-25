package com.cenfotec.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.graphql.model.Especie;
import com.cenfotec.graphql.service.EspecieService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class EspecieQuery implements GraphQLQueryResolver {

	@Autowired
	 private EspecieService especieService;
	
	 public List<Especie> getEspecies(int count) {
		 return this.especieService.listarEspecies();
	 }
	 
	 public Optional<Especie> getEspecie(int guid) {
		 return this.especieService.listarEspecieByGuid(guid);
	 }
}
