package Exercicio.Pratico3.repository;

import Exercicio.Pratico3.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
