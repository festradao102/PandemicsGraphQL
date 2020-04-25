package com.cenfotec.graphql.mutation;

import java.util.Optional;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cenfotec.graphql.model.Especie;
import com.cenfotec.graphql.repository.IEspecieRepository;
import com.cenfotec.graphql.service.EspecieService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class EspecieMutation implements GraphQLMutationResolver {

	@Autowired
	private EspecieService especieService;
	
	@Autowired
	private IEspecieRepository especieRepo;
	

	public Especie createEspecie(String nombre, String descubierto, String tipo) {
	 return this.especieService.createEspecie(nombre, descubierto, tipo);
	}
	
	public int deleteEspecie(int guid) {		
		return this.especieService.eliminarEspecie(guid);
	}
	
	public Especie updateEspecie(int guid, String nombre, String descubierto, String tipo) {
		return this.especieService.actualizarEspecie(guid,nombre,descubierto,tipo);
	}	

}
