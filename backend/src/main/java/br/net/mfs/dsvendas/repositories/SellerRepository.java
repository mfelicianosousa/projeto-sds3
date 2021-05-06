package br.net.mfs.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.mfs.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
