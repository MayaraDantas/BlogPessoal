package org.generatin.BlogPessoal.repository;

import java.util.List;

import org.generatin.BlogPessoal.Model.tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<tema, Long> {
	public List<tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
