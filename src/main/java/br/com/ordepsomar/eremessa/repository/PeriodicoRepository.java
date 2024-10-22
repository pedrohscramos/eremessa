package br.com.ordepsomar.eremessa.repository;

import br.com.ordepsomar.eremessa.entity.Periodico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PeriodicoRepository extends JpaRepository<Periodico, UUID> {
}
