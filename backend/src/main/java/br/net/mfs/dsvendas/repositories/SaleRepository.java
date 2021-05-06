package br.net.mfs.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.net.mfs.dsvendas.dto.SaleSuccessDTO;
import br.net.mfs.dsvendas.dto.SaleSumDTO;
import br.net.mfs.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new br.net.mfs.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller() ;
	
	@Query("SELECT new br.net.mfs.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller() ;
}
