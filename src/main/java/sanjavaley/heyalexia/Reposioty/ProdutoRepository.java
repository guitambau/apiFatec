package sanjavaley.heyalexia.Reposioty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sanjavaley.heyalexia.Entity.Produto;


@Repository
public interface ProdutoRepository 
extends JpaRepository<Produto, Long> {

}
