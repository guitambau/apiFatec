package sanjavaley.heyalexia.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sanjavaley.heyalexia.Entity.Produto;
import sanjavaley.heyalexia.Service.ProdutoServiceImp;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoServiceImp service;	
	
				
	@GetMapping
    public List<Produto> GetAllProduto() {
        return service.getAllProduto();
    }
	
	
	
	
		
	
	
	
	
	
	
}
