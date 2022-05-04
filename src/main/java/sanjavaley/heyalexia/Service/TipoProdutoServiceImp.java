package sanjavaley.heyalexia.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import sanjavaley.heyalexia.Entity.TipoProduto;
import sanjavaley.heyalexia.Reposioty.TipoProdutoRepository;

@Service
public class TipoProdutoServiceImp {
	
	@Autowired
	private TipoProdutoRepository repository;

	public List<TipoProduto> getAllTipoProduto() {
		return repository.findAll();		
	}
	
	public TipoProduto BuscaPorId(long _id){
		Optional<TipoProduto> obj = repository.findById(_id);
		return obj.orElse(null);
	}
}
