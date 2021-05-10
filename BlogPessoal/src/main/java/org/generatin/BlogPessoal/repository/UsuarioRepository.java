package org.generatin.BlogPessoal.repository;

import java.util.Optional;

import org.generatin.BlogPessoal.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<org.generatin.BlogPessoal.Model.Usuario> findByUsuario(String usuario);
}
