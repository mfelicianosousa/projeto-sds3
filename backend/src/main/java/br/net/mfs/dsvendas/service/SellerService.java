package br.net.mfs.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.dsvendas.dto.SellerDTO;
import br.net.mfs.dsvendas.entities.Seller;
import br.net.mfs.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository ;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll() ;
		return result.stream().map(x-> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}
