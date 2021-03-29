package br.com.paolacazetta.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paolacazetta.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
