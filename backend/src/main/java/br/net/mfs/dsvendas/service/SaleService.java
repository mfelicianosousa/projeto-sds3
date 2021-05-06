package br.net.mfs.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.mfs.dsvendas.dto.SaleDTO;
import br.net.mfs.dsvendas.dto.SaleSuccessDTO;
import br.net.mfs.dsvendas.dto.SaleSumDTO;
import br.net.mfs.dsvendas.entities.Sale;
import br.net.mfs.dsvendas.repositories.SaleRepository;
import br.net.mfs.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository ;
	
	@Autowired
	private SellerRepository sellerRepository ;
	
	@Transactional(readOnly=true)
	public Page<SaleDTO> findAll(Pageable pageable){
		
		sellerRepository.findAll() ; // Mantém os vendedores em cache 
		
		Page<Sale> result = repository.findAll(pageable) ;
		return result.map(x-> new SaleDTO(x));
	}
	
	@Transactional(readOnly=true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller() ;
	}
	
	@Transactional(readOnly=true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller() ;
	}
}
