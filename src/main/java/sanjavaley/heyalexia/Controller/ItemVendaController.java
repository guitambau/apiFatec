package sanjavaley.heyalexia.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sanjavaley.heyalexia.Entity.ItemVenda;
import sanjavaley.heyalexia.Service.ItemVendaServiceImp;

@RestController
@RequestMapping(value = "/item-venda")
public class ItemVendaController {
	
	
	
	@Autowired
	private ItemVendaServiceImp service;
	
	
	@GetMapping(value = "/top")
	public ArrayList<Long> topFiveSell(){
		
		ArrayList<Long> lista1 = new ArrayList<>();
		ArrayList<Long> lista = new ArrayList<>();
		lista.addAll(service.topFive());
		for (int i = 0; i < lista.size(); i++) {
		      lista1.add(lista.get(i));
		    }
		return lista1;
		
		
		
		
		
	}

}
