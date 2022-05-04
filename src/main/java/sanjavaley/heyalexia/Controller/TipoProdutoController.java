package sanjavaley.heyalexia.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sanjavaley.heyalexia.Entity.TipoProduto;
import sanjavaley.heyalexia.Service.TipoProdutoServiceImp;

@RestController
@RequestMapping(value = "/produtotipo")
public class TipoProdutoController {

	@Autowired
	private TipoProdutoServiceImp service;
	
		
	@GetMapping(value = "/todos")
    public List<TipoProduto> GetAllTipoProduto() {
        return service.getAllTipoProduto();        
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TipoProduto> findById(@PathVariable long id) {		
		TipoProduto obj = service.BuscaPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	

	
	
}
