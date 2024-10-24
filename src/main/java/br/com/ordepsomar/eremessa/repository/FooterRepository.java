package br.com.ordepsomar.eremessa.repository;

import br.com.ordepsomar.eremessa.entity.Footer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FooterRepository extends JpaRepository<Footer, Long> {
}
