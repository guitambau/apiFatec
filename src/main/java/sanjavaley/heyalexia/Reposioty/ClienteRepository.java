package sanjavaley.heyalexia.Reposioty;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sanjavaley.heyalexia.Entity.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	

		@Query("select c from Cliente c where c.Nome like ?1%")
		Optional<List<Cliente>> findByNome(String nome);
		
		@Query(nativeQuery = true, value = "select count(cliente_id) as contador from cliente group by cliente_genero")
		List<Integer> contadorGenero();
	
}
