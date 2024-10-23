package br.com.ordepsomar.eremessa.repository;

import br.com.ordepsomar.eremessa.entity.Periodico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeriodicoRepository extends JpaRepository<Periodico, Long> {
}
