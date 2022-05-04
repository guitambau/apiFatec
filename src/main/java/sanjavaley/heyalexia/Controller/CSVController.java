package sanjavaley.heyalexia.Controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import sanjavaley.heyalexia.Entity.Cliente;
import sanjavaley.heyalexia.Entity.Endereco;
import sanjavaley.heyalexia.Reposioty.ClienteRepository;
import sanjavaley.heyalexia.Reposioty.EnderecoRepository;



@Controller
@RequestMapping(value = "/upload")
public class CSVController {
	
	
	@Autowired
	private ClienteRepository repository;
	@Autowired
	private EnderecoRepository eRepository;
		
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> save(@RequestParam("file") MultipartFile file) 
throws Exception{
		List<Cliente> cliente = new ArrayList<>();
		InputStream IStream = file.getInputStream();
		CsvParserSettings setting = new CsvParserSettings();
		setting.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(setting);
		
		List<Record> parseAllRecord = parser.parseAllRecords(IStream);
		parseAllRecord.forEach(record ->{
			Cliente clientes = new Cliente();
			Endereco end = eRepository.findById(Long.parseLong(record.getString("Endereco_Id")));
			clientes.setNome(record.getString("Nome"));
			clientes.setSobrenome(record.getString("Sobrenome"));			
			clientes.setClienteEmail(record.getString("ClienteEmail"));
			clientes.setClienteTelefone(record.getString("ClienteTelefone"));
			clientes.setClienteGenero(record.getString("Genero"));					
			clientes.setEndereco(end);
			cliente.add(clientes);				
		});
		repository.saveAll(cliente);
		//TODO AQUI VAMOS DAR A RESPOSTA DE QUE FOI ADICIONADO COM SUCESSO
		return new ResponseEntity<Cliente>(HttpStatus.CREATED);
	}
}
