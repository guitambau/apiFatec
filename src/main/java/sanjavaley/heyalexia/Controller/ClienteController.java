package sanjavaley.heyalexia.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sanjavaley.heyalexia.Entity.Cliente;
import sanjavaley.heyalexia.Service.ClienteServiceImp;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	
	@Autowired
	private ClienteServiceImp service;
	
	@GetMapping(value = "/{nome}")
	public ResponseEntity<List<Cliente>> findByNome(@PathVariable String nome){
		try {
		List<Cliente> list = service.findByNome(nome);
		if(list.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value = "/genero")
	public List<Integer> contaGenero(){
		List<Integer> genero = service.genero();
		return genero;
		
	}
	
	@GetMapping(value = "/todos")
	public ResponseEntity<List<Cliente>> buscaTodos(){
		List<Cliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/apaga")
	public void apagaTodos() {
		service.apagaTodos();
	}
}
