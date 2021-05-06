package br.net.mfs.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.mfs.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
