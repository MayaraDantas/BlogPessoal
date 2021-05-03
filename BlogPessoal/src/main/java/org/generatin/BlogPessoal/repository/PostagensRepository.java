package org.generatin.BlogPessoal.repository;





import java.util.List;

import org.generatin.BlogPessoal.Model.postagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagensRepository extends JpaRepository< postagens,  Long> {

	public List<postagens> findAllByTituloContainingIgnoreCase(String titulo); 
	
}
