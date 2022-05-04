package sanjavaley.heyalexia.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ENDERECO")
public class Endereco {
	
	
	@Id
    @GeneratedValue
	@Column(name = "ENDERECO_ID")
	private long id;
	
	@Column(name = "LOGADOURO", length = 100, nullable = false)
	private String logadouro;
	
	@ManyToOne
	@JoinColumn(name = "BAIRRO_ID")
	private Bairro bairroId;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "endereco")
	private List<Cliente> cliente;

}
