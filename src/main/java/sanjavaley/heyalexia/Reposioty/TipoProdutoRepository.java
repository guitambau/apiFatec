package sanjavaley.heyalexia.Reposioty;

import org.springframework.data.jpa.repository.JpaRepository;


import sanjavaley.heyalexia.Entity.TipoProduto;

public interface TipoProdutoRepository
extends JpaRepository<TipoProduto, Long> {

}
