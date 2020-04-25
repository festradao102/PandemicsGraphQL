package com.cenfotec.graphql.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.graphql.model.Especie;
import com.cenfotec.graphql.repository.IEspecieRepository;

@Service
public class EspecieServiceImpl implements EspecieService{
	
	@Autowired
	private IEspecieRepository repoEspecie;
			
	@Override
	public Especie createEspecie(String pnombre, String pdescubierto, String ptipo) {
		String lUUID = String.format("%040d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16));
		Especie especie = new Especie();
		
		especie.setNombre(pnombre);
		especie.setDescubierto(pdescubierto);
		especie.setTipo(ptipo);
		especie.setUUID(lUUID);
		especie.setFecha(java.time.LocalDateTime.now());
        return repoEspecie.save(especie);   
	}	
	
	@Override
	public List<Especie> listarEspecies() {
		return repoEspecie.findAll();
	}

	@Override
	public Optional<Especie> listarEspecieByGuid(int guid) {
		return repoEspecie.findById(guid);
	}
	
	@Override
	public int eliminarEspecie (int guid) {
		repoEspecie.deleteById(guid);
		return guid;
	}
	
	@Override
	public Especie actualizarEspecie(int guid, String nombre, String descubierto, String tipo) {
		Especie especie = repoEspecie.findByGuid(guid);
		especie.setNombre(nombre);
		especie.setDescubierto(descubierto);
		especie.setTipo(tipo);
		
		return repoEspecie.save(especie);
	}	

}
