package com.cenfotec.graphql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.cenfotec.graphql.model.Especie;

@Service
public interface EspecieService {	

	public Especie createEspecie(String nombre, String descubierto, String tipo);
	public List<Especie> listarEspecies();	
	public Optional<Especie> listarEspecieByGuid(int guid);
	public int eliminarEspecie(int guid);
	public Especie actualizarEspecie(int guid, String nombre, String descubierto, String tipo);
	

}
